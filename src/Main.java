import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean cambio = true;
        int opc, opc2, medio;
        int totalVotos, sumaCostos;
        double promedioCosto;

        Candidato candidato1 = new Candidato("Joan Chindoy");
        Candidato candidato2 = new Candidato("William Matallana");
        Candidato candidato3 = new Candidato("Kevin Santos");

        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(candidato1);
        candidatos.add(candidato2);
        candidatos.add(candidato3);

        System.out.println("    - - - EJERCICIO CANDIDATOS - - -");

        do {
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

            switch (opc) {
                case 1, 2, 3 -> {
                    System.out.println("""
                            \n  ¿Por cuál medio fue influenciado el voto?
                            1. Internet
                            2. Radio
                            3. Televisión
                        """);
                    System.out.print("  Dígite el número del medio: ");
                    medio = teclado.nextInt();

                    if (medio == 1 || medio == 2 || medio == 3) {
                        if (opc == 1) {
                            candidato1.votar(medio);
                        } else if (opc == 2) {
                            candidato2.votar(medio);
                        } else {
                            candidato3.votar(medio);
                        }
                        System.out.println("    VOTO AGREGADO CORRECTAMENTE\n");
                    } else {
                        System.out.println("    OPCIÓN NO VALIDA\n");
                    }
                }

                case 4 -> {
                    System.out.println("""
                            \n  ¿Qué información desea ver?
                            1. Candidato #1 - Joan Chindoy.
                            2. Candidato #2 - William Matallana.
                            3. Candidato #3 - Kevin Santos.
                            4. Información General.
                        """);
                    System.out.print("  Digite una opción: ");
                    opc2 = teclado.nextInt();
                    totalVotos = candidato1.getTotalVotos() + candidato2.getTotalVotos() + candidato3.getTotalVotos();

                    if (opc2 == 1) {
                        System.out.println("\n  --- Información del Candidato 1 ---");
                        System.out.println(candidato1.mostrarInfo());
                        System.out.println("  Porcentaje de votos: " + candidato1.getPorcentaje(totalVotos) + "%\n");
                    } else if (opc2 == 2) {
                        System.out.println("\n  --- Información del Candidato 2 ---");
                        System.out.println(candidato2.mostrarInfo());
                        System.out.println("  Porcentaje de votos: " + candidato2.getPorcentaje(totalVotos) + "%\n");
                    } else if (opc2 == 3) {
                        System.out.println("\n  --- Información del Candidato 3 ---");
                        System.out.println(candidato3.mostrarInfo());
                        System.out.println("  Porcentaje de votos: " + candidato3.getPorcentaje(totalVotos) + "%\n");
                    } else if (opc2 == 4) {
                        System.out.println("\n  --- INFORMACIÓN GENERAL ---\n");
                        System.out.println(candidato1.mostrarInfo());
                        System.out.println("  Porcentaje de votos: " + candidato1.getPorcentaje(totalVotos) + "%\n");
                        System.out.println(candidato2.mostrarInfo());
                        System.out.println("  Porcentaje de votos: " + candidato2.getPorcentaje(totalVotos) + "%\n");
                        System.out.println(candidato3.mostrarInfo());
                        System.out.println("  Porcentaje de votos: " + candidato3.getPorcentaje(totalVotos) + "%\n");
                        sumaCostos = candidato1.getCostoCampana() + candidato2.getCostoCampana() + candidato3.getCostoCampana();
                        promedioCosto = sumaCostos / 3.0;
                        System.out.println("    Costo promedio de campaña: $" + promedioCosto + "\n");
                    } else {
                        System.out.println("    OPCIÓN NO VÁLIDA\n");
                    }
                }
                case 5 -> {
                    candidato1.reiniciarVotos();
                    candidato2.reiniciarVotos();
                    candidato3.reiniciarVotos();
                    System.out.println("    URNAS VACIADAS\n");
                }
                case 6 -> {
                    System.out.println("    HASTA LUEGO :)");
                    cambio = false;
                }
                default -> System.out.println(" # # # OPCIÓN NO VÁLIDA # # #\n");
            }

        } while (cambio);
    }
}
