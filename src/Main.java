import java.util.List;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        boolean cambio = true;
        int carga;
        String n1, n2, estado;
        List<Robot> lstRobots = new ArrayList<>();
        List<Hombre> lstPersonas = new ArrayList<>();


        System.out.println("    * * * * PARCIAL 2 - ROBOT * * * *");
        do{
            System.out.println("""
                     \n    + + + + MENÚ + + + +
                     1. Crear Robot.
                     2. Crear Hombre.
                 """);
            System.out.print("    Dígite la opción: ");
            opc = teclado.nextInt();
            switch (opc){
                case 1 -> {
                    teclado.nextLine();
                    System.out.println("\n    * * * * CREAR ROBOT * * * *");
                    System.out.print("    Dígite el nombre del robot: ");
                    n1 = teclado.nextLine();
                    System.out.print("    Dígite la batería inicial del robot: ");
                    carga = teclado.nextInt();
                    System.out.print("    Dígite el estado del robot: ");

                    lstPersonas.add(new Robot(n1, carga));
                }
                case 2 -> {
                    teclado.nextLine();
                    System.out.println("\n    * * * * CREAR HOMBRE * * * *");
                    System.out.print("    Dígite el nombre de la persona: ");
                    n2 = teclado.nextLine();
                    lstPersonas.add(new Hombre(n2));
                }
                default ->{
                    cambio = false;
                }

        }while(cambio);

    }
}