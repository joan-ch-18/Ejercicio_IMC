import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Libro> lstLibros = new ArrayList<>();

        int opc;
        String t1;
        String a1;
        double p1;
        double pe1;
        double ta1;
        boolean cambio = true;

        System.out.println("    - - - - EJERCICIO LIBROS - - - -");

        do {
            System.out.println("""
                    + + + + MENÚ + + + +
                    1. Libro Impreso.
                    2. Libro Digital.
                    3. Mostrar Información.
                    4. Salir.
                """);
            System.out.print("    Dígite la opción: ");
            opc = teclado.nextInt();
            switch (opc){
                case 1 -> {
                    teclado.nextLine();
                    System.out.print("    Dígite el título del libro: ");
                    t1 = teclado.nextLine();
                    System.out.print("    Dígite el autor del libro: ");
                    a1 = teclado.nextLine();
                    System.out.print("    Dígite el precio del libro (en pesos colombianos): ");
                    p1 = teclado.nextDouble();
                    System.out.print("    Dígite el peso del libro (en gramos): ");
                    pe1 = teclado.nextDouble();
                    lstLibros.add(new LibroImpreso(t1,a1,p1,pe1));
                }
                case 2 -> {
                    teclado.nextLine();
                    System.out.print("    Dígite el título del libro: ");
                    t1 = teclado.nextLine();
                    System.out.print("    Dígite el autor del libro: ");
                    a1 = teclado.nextLine();
                    System.out.print("    Dígite el precio del libro (en pesos colombianos): ");
                    p1 = teclado.nextDouble();
                    System.out.print("    Dígite el tamaño del archivo del libro (en mega bytes): ");
                    ta1 = teclado.nextDouble();
                    lstLibros.add(new LibroDigital(t1,a1,p1,ta1));
                }
                case 3 -> {
                    int l;
                    System.out.println("""
                                ¿Qué libros desea ver?
                                1. Libros Impresos.
                                2. Libros Digitales.
                                3. Volver
                            """);
                    System.out.print("  Dígite una opción: ");
                    l=teclado.nextInt();
                    if(l==1){
                        System.out.println("   #  #  #  #  #  #  #  #  #  #  #");
                        System.out.println("    LIBROS IMPRESOS ");
                        for (Libro libros : lstLibros) {
                            if(libros instanceof LibroImpreso){
                                System.out.println(libros.MostrarInfo());
                            }

                        }

                    }if(l==2){
                        System.out.println("   #  #  #  #  #  #  #  #  #  #  #");
                        System.out.println("    LIBROS DIGITALES ");
                        for (Libro libros : lstLibros) {
                            if(libros instanceof LibroDigital){
                                System.out.println(libros.MostrarInfo());
                            }

                        }
                    }
                }
                    default -> {
                        cambio = false;
                    }
                }
        } while (cambio);
    }
}
