import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        double saldo;
        int opc;
        boolean cambio = true;
        int min = 1;
        int max = 3;
        int sorteo;

        //APUESTA Y GANA
        System.out.println("");
        System.out.println("    ****** EJERCICIO APUESTA Y GANA ******");
        System.out.println("    Dígite el valor que desea agregar: ");
        saldo = teclado.nextInt();

        do {
            sorteo = aleatorio.nextInt((max - min + 1)) + min;
            System.out.println("    Número de sorteo: " + sorteo + " ");
            if (sorteo == 1) {
                saldo = saldo * 2;
                System.out.println("    Nuevo saldo, duplicó el valor: "+saldo);
                System.out.println("""
                         ¿Desea seguir jugando?
                         1. Seguir.
                         2. Salir.
                                """ );
                opc = teclado.nextInt();
                if(opc == 1){
                    sorteo = aleatorio.nextInt((max - min + 1)) + min;
                    continue;
                }else{
                    System.out.println("    Te quedaste con un saldo de: "+saldo);
                    cambio = false;
                }

            } else if (sorteo == 2) {
                saldo = saldo/2;
                System.out.println("    Nuevo saldo, perdió la mitad: "+saldo);
                System.out.println("""
                                ¿Desea seguir jugando?
                                1. Seguir.
                                2. Salir.
                                """ );
                opc = teclado.nextInt();
                if(opc == 1){
                    sorteo = aleatorio.nextInt((max - min + 1)) + min ;
                    continue;
                }else{
                    System.out.println("    Te quedaste con un saldo de: "+saldo);
                    cambio = false;
                }
            } else {
                saldo -= saldo;
                System.out.println("    Saldo: "+saldo);
                System.out.println("    Perdió todo :(");
                cambio = false;
            }
        }while (cambio);

    }
}