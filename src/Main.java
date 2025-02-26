import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("    ****** EJERCICIO DADOS ******");

        int min = 2;
        int max = 100;

        Random aleatorio = new Random();

        int lanzada = aleatorio.nextInt((max - min + 1))+min;
        System.out.println("    Los dados se lanzaron "+ lanzada + " veces");

        int minCara = 1;
        int maxCara = 6;
        int sumaD1 = 0;
        int sumaD2 = 0;

        for(int i=0; i<= lanzada; i++){
            int tirada1 = aleatorio.nextInt((maxCara - minCara + 1))+ minCara;
            int tirada2 = aleatorio.nextInt((maxCara - minCara + 1))+ minCara;

            sumaD1 = sumaD1 + tirada1;
            sumaD2 = sumaD2 + tirada2;
            System.out.println("    " + tirada1 + " | " + tirada2);
        }

        System.out.println("----- SUMA -----");
        System.out.println("    " + sumaD1 + "|" + sumaD2);

    }
}