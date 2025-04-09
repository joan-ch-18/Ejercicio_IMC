import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opc, opc2, medio;
        int votosC1 = 0;
        int votosC2 = 0;
        int votosC3 = 0;
        int numVotosInternet = 0;
        int numVotosRadio = 0;
        int numVotosTelevision = 0;
        double publicidadInternet = 700000;
        double publicidadRadio = 200000;
        double publicidadTelevision = 600000;
        double costoCampaña;
        double operar1, operar2, operar3;
        int numVotosTotales;
        boolean cambio = true;


        System.out.println("    - - - EJERCICIO CANDIDATOS - - -");

        do{
            System.out.println("""
                        * * * * MENÚ * * * *
                        1. Candidato #1 - Joan Chindoy.
                        2. Candidato #2 - William Matallana.
                        3. Candidato #3 - Kevin Santos.
                        4. Mostrar Información.
                        5. Vaciar Urnas.
                        6. Salir.
                    """);
            System.out.print("  Dígite el candidato por el cúal desea votar: ");
            opc = teclado.nextInt();

            switch(opc){
                case 1 ->{
                    teclado.nextLine();
                    votosC1 ++;
                    System.out.println("""
                        * * * * JOAN CHINDOY * * * *
                        1. Internet.
                        2. Radio.
                        3. Televisión.
                        4. Volver.
                    """);
                    System.out.print("  Dígite el número del medio por el cúal fue influenciado: ");
                    medio = teclado.nextInt();
                    if (medio == 1){
                        numVotosInternet ++;
                        operar1 = numVotosInternet * publicidadInternet;
                    } else if (medio == 2){
                        numVotosRadio ++;
                        operar2 = numVotosRadio * publicidadRadio;
                    } else if (medio == 3){
                        numVotosTelevision ++;
                        operar3 = numVotosTelevision * publicidadTelevision;
                    }

                }
                case 2 ->{
                    teclado.nextLine();

                }
                case 3 -> {
                    teclado.nextLine();
                }
                case 4 ->{
                    System.out.println("""
                                ¿De cúal Candidato desea ver la información?
                                1. Candidato #1.
                                2. Candidato #2.
                                3. Candidato #3.
                                4. Volver.
                            """);
                    System.out.print("  Dígite la opción: ");
                    opc2 = teclado.nextInt();

                }
                default -> {
                    cambio = false;
                }

            }
        }while(cambio);
    }
}