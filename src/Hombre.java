import java.util.Scanner;
public class Hombre {
    private String nombre;
    Scanner teclado = new Scanner(System.in);
    boolean cambio = true;
    int opc;

    public void jugarConRobot(Robot robot){
        do{
            System.out.print("""
                      \n    + + + + MENÚ + + + +
                      1. Avanzar o Retroceder al Robot.
                      2. Ver Energía del Robot.
                      3. Dormir o Despertar al Robot.
                      4. Recargar Batería del Robot.
                      5. Salir.""");
             opc = teclado.nextInt();
             switch (opc){
                 case 1 -> {

                 }
             }

        }while(cambio);
    }
}
