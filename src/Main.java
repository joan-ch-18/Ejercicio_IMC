import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numLlamadasLocal=0, numLlamadasLargaDistancia=0, numLlamadasCelular=0;
        int totalNumLlamadas, totalMinLlamadas;
        int minLocal= 0, minLargaDistancia= 0, minCelular= 0;
        double minLlamadaLocal = 50;
        double minLlamadaLargaDistancia = 350;
        double minLlamadaCelular = 150;
        double totalLocal = 0, totalLargaDistancia = 0, totalCelular = 0, totalCosto;
        int opc, opc2;
        boolean cambio = true;

        System.out.println(" * * * * PARCIAL EMPRESA TELEFÓNICA * * * *");
        do{
            System.out.println("""
                    + + + MENÚ + + +
                    1. Líneas Telefónicas.
                    2. Detalles.
                    3. Salir.
                    """);
            opc = teclado.nextInt();
            switch (opc){
                case 1 -> {
                    System.out.println("""
                        Líneas Disponibles:
                        1. Local.
                        2. Larga Distancia.
                        3. Celular.
                        ¿Qué línea telefónica desea escoger?
                    """);
                    opc2 = teclado.nextInt();
                    if (opc2 == 1){
                        numLlamadasLocal ++;
                        System.out.println("    Se ha agregado una llamada local, ¿Cuántos minutos consumió?");
                        minLocal = teclado.nextInt();
                        if (minLocal >= 0) {
                            totalLocal = minLocal * minLlamadaLocal;
                        } else {
                            numLlamadasLocal = 0;
                            System.out.println("    Dígite un número válido");
                        }
                    } else if (opc2 == 2) {
                        numLlamadasLargaDistancia ++;
                        System.out.println("    Se ha agregado una llamada larga distancia, ¿Cuántos minutos consumió?");
                        minLargaDistancia = teclado.nextInt();
                        if (minLargaDistancia >= 0) {
                            totalLargaDistancia = minLargaDistancia * minLlamadaLargaDistancia;
                        } else {
                            numLlamadasLargaDistancia = 0;
                            System.out.println("    Dígite un número válido");
                        }
                    }else if (opc2 == 3){
                        numLlamadasCelular ++;
                        System.out.println("    Se ha agregado una llamada celular, ¿Cuántos minutos consumió?");
                        minCelular = teclado.nextInt();
                        if (minCelular >= 0) {
                            totalCelular = minCelular * minLlamadaCelular;
                        } else {
                            numLlamadasCelular = 0;
                            System.out.println("    Dígite un número válido");
                        }
                    }else {
                        System.out.println("    # # # OPCIÓN NO VÁLIDA # # #");
                    }
                }
                case 2 -> {
                    totalNumLlamadas = (numLlamadasLocal + numLlamadasLargaDistancia + numLlamadasCelular);
                    totalMinLlamadas = (minLocal + minLargaDistancia + minCelular);
                    totalCosto = (totalLocal + totalLargaDistancia + totalCelular);
                    if (totalMinLlamadas >= 0){
                        totalMinLlamadas = (minLocal + minLargaDistancia + minCelular);
                    } else{
                        totalMinLlamadas = 0;
                    }
                    System.out.println("    $ $ $ $ $ DETALLES $ $ $ $ $");
                    System.out.println("    Número de llamadas realizadas: "+totalNumLlamadas);
                    System.out.println("    Total minutos consumidos: "+totalMinLlamadas);
                    System.out.println("    Llamadas Local: "+ numLlamadasLocal);
                    System.out.println("    Llamadas Larga Distancia: "+ numLlamadasLargaDistancia);
                    System.out.println("    Llamadas Celular: "+ numLlamadasCelular);
                    System.out.println("    Costo Total: "+ totalCosto);
                    System.out.println("    - - - - - - - - - - - - - - -");
                }
                case 3 ->{
                    cambio = false;
                }
            }
        }while (cambio);
    }
}