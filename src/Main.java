import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Empleado> lstEmpleados = new ArrayList<>();

        int opc, opc2;
        String n1;
        int e1, ht1, sf1, sh1;
        boolean cambio = true;

        System.out.println("    - - - EJERCICIO EMPRESA - - -");

        do{
            System.out.println("""
                        * * * * MENÚ * * * *
                        1. Empleado de Planta.
                        2. Empleado por Horas.
                        3. Mostrar Información.
                        4. Salir.
                    """);
            System.out.print("  Dígite la opción: ");
            opc = teclado.nextInt();

            switch(opc){
                case 1 ->{
                    teclado.nextLine();
                    System.out.print("  Dígite el nombre del empleado: ");
                    n1 = teclado.nextLine();
                    System.out.print("  Dígite la edad del empleado: ");
                    e1 = teclado.nextInt();
                    System.out.print("  Dígite el salario fijo: ");
                    sf1 = teclado.nextInt();
                    lstEmpleados.add(new EmpleadoPlanta(n1,e1, sf1));
                }
                case 2 ->{
                    teclado.nextLine();
                    System.out.print("  Dígite el nombre del empleado: ");
                    n1 = teclado.nextLine();
                    System.out.print("  Dígite la edad del empleado: ");
                    e1 = teclado.nextInt();
                    System.out.print("  Dígite el número de horas trabajadas: ");
                    ht1 = teclado.nextInt();
                    System.out.print("  Dígite el pago por hora: ");
                    sh1 = teclado.nextInt();
                    lstEmpleados.add(new EmpleadoHoras(n1, e1, ht1, sh1));
                }
                case 3 ->{
                    System.out.println("""
                                ¿De cúal tipo de empleado desea ver información?
                                1. Empleados de Planta.
                                2. Empleados por Horas.
                                3. Volver.
                            """);
                    System.out.print("  Dígite la opción: ");
                    opc2 = teclado.nextInt();
                    if (opc2 == 1){
                        System.out.println("   #  #  #  #  #  #  #  #  #  #  #");
                        System.out.println("    EMPLEADOS DE PLANTA"+'\n');
                        for (Empleado empleados: lstEmpleados) {
                            if(empleados instanceof EmpleadoPlanta) {
                                System.out.println(((EmpleadoPlanta) empleados).MostrarInfo());
                            }
                        }
                    } else if (opc2 == 2) {
                        System.out.println("   #  #  #  #  #  #  #  #  #  #  #");
                        System.out.println("    EMPLEADOS POR HORAS"+'\n');
                        for (Empleado empleados: lstEmpleados){
                            if (empleados instanceof EmpleadoHoras){
                            System.out.println(((EmpleadoHoras) empleados).MostrarInfo());
                            }
                        }
                    }
                }
                default -> {
                    cambio = false;
                }

            }
        }while(cambio);
    }
}