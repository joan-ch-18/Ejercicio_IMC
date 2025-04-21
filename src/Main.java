import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opc;
        boolean cambio = true;
        //Variables para personas
        String n1, a1, d1;
        int e1;
        //Variables para perros
        String placa, nombre, raza, tamano;
        int edadP;
        boolean estadoPerro = false;
        List<Perro> lstPerros = new ArrayList<>();
        List<Persona> lstPersonas = new ArrayList<>();

        System.out.println("    * * * * EJERCICIO ADOPTAR PERROS * * * *");

        do{
            System.out.println("""
                     + + + + MENÚ + + + +
                     1. Registrar Persona.
                     2. Registrar Perro.
                     3. Personas Registradas.
                     4. Perros Disponibles.
                     5. Adoptar Perro.
                     6. Consultar Perro Más Viejo.
                     7. Salir.
                 """);
            System.out.print("    Dígite la opción: ");
            opc = teclado.nextInt();
            switch (opc){
                case 1 -> {
                    teclado.nextLine();
                System.out.print("    Dígite el nombre de la persona: ");
                n1 = teclado.nextLine();
                System.out.print("    Dígite el apellido de la persona: ");
                a1 = teclado.nextLine();
                System.out.print("    Dígite la edad de la persona: ");
                e1 = teclado.nextInt();
                System.out.print("    Dígite el número de documento de la persona: ");
                d1 = teclado.nextLine();
                lstPersonas.add(new Persona(n1, a1, e1, d1));
                }
                case 2 -> {

                }
            }

        }while (cambio);
    }
}