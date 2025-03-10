import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        double C, F, K, R, operar;
        boolean cambio = true;
        do{
            System.out.println("    * * * MENÚ DE CONVERSIONES * * *");
            System.out.println("""
                        1. Celsius a Fahrenheit.
                        2. Celsius a Kelvin.
                        3. Celsius a Rankine.
                        4. Celsius a Réaumur.
                        5. Fahrenheit a Celsius.
                        6. Fahrenheit a Kelvin.
                        7. Fahrenheit a Rankine.
                        8. Fahrenheit a Réaumur.
                        9. Kelvin a Celsius.
                        10. Kelvin a Fahrenheit.
                        11. Kelvin a Rankine.
                        12. Kelvin a Réaumur.
                        13. Rankine a Celsius.
                        14. Rankine a Fahrenheit.
                        15. Rankine a Kelvin.
                        16. Rankine a Réaumur.
                        17. Salir.
                    """);
            System.out.println("    Dígite la opción que desea realizar: ");
            opc = teclado.nextInt();
            switch (opc){
                case 1 -> {
                    System.out.println("    Dígite el número de grados Celsius: ");
                    C = teclado.nextDouble();
                    operar = (C*1.8)+32;
                    System.out.println("    "+C+"° Celsius a Fahrenheit es: "+operar+"°");
                    System.out.println("");
                }
                case 2 -> {
                    System.out.println("    Dígite el número de grados Celsius: ");
                    C = teclado.nextDouble();
                    operar = C+273.15;
                    System.out.println("    "+C+"° Celsius a Kelvin es: "+operar+"°");
                    System.out.println("");
                }
                case 3 -> {
                    System.out.println("    Dígite el número de grados Celsius: ");
                    C = teclado.nextDouble();
                    operar = (C+273.15)*1.8;
                    System.out.println("    "+C+"° Celsius a Rankine es: "+operar+"°");
                    System.out.println("");
                }
                case 4 -> {
                    System.out.println("    Dígite el número de grados Celsius: ");
                    C = teclado.nextDouble();
                    operar = C*0.8;
                    System.out.println("    "+C+"° Celsius a Réaumur es: "+operar+"°");
                    System.out.println("");
                }
                case 5 -> {
                    System.out.println("    Dígite el número de grados Fahrenheit: ");
                    F = teclado.nextDouble();
                    operar = (F-32)*0.55;
                    System.out.println("    "+F+"° Fahrenheit a Celsius es: "+operar+"°");
                    System.out.println("");
                }
                case 6 -> {
                    System.out.println("    Dígite el número de grados Fahrenheit: ");
                    F = teclado.nextDouble();
                    operar = (F-32)*0.55+273.15;
                    System.out.println("    "+F+"° Fahrenheit a Kelvin es: "+operar+"°");
                    System.out.println("");
                }
                case 7 -> {
                    System.out.println("    Dígite el número de grados Fahrenheit: ");
                    F = teclado.nextDouble();
                    operar = F+459.67;
                    System.out.println("    "+F+"° Fahrenheit a Rankine es: "+operar+"°");
                    System.out.println("");
                }
                case 8 -> {
                    System.out.println("    Dígite el número de grados Fahrenheit: ");
                    F = teclado.nextDouble();
                    operar = (F-32)*0.44;
                    System.out.println("    "+F+"° Fahrenheit a Réaumur es: "+operar+"°");
                    System.out.println("");
                }
                case 9 -> {
                    System.out.println("    Dígite el número de grados Kelvin: ");
                    K = teclado.nextDouble();
                    operar = K - 273.15;
                    System.out.println("    "+K+"° Kelvin a Celsius es: "+operar+"°");
                    System.out.println("");
                }
                case 10 -> {
                    System.out.println("    Dígite el número de grados Kelvin: ");
                    K = teclado.nextDouble();
                    operar = (K-273.15)*1.8+32;
                    System.out.println("    "+K+"° Kelvin a Fahrenheit es: "+operar+"°");
                    System.out.println("");
                }
                case 11 -> {
                    System.out.println("    Dígite el número de grados Kelvin: ");
                    K = teclado.nextDouble();
                    operar = K*1.8;
                    System.out.println("    "+K+"° Kelvin a Rankine es: "+operar+"°");
                    System.out.println("");
                }
                case 12 -> {
                    System.out.println("    Dígite el número de grados Kelvin: ");
                    K = teclado.nextDouble();
                    operar = (K-273.15)*0.8;
                    System.out.println("    "+K+"° Kelvin a Réaumur es: "+operar+"°");
                    System.out.println("");
                }
                case 13 -> {
                    System.out.println("    Dígite el número de grados Rankine: ");
                    R = teclado.nextDouble();
                    operar = (R-491.67)*0.555;
                    System.out.println("    "+R+"° Rankine a Celsius es: "+operar+"°");
                    System.out.println("");
                }
                case 14 -> {
                    System.out.println("    Dígite el número de grados Rankine: ");
                    R = teclado.nextDouble();
                    operar = R-459.67;
                    System.out.println("    "+R+"° Rankine a Fahrenheit es: "+operar+"°");
                    System.out.println("");
                }
                case 15 -> {
                    System.out.println("    Dígite el número de grados Rankine: ");
                    R = teclado.nextDouble();
                    operar = R*0.555;
                    System.out.println("    "+R+"° Rankine a Kelvin es: "+operar+"°");
                    System.out.println("");
                }
                case 16 -> {
                    System.out.println("    Dígite el número de grados Rankine: ");
                    R = teclado.nextDouble();
                    operar = (R-491.67)*0.444;
                    System.out.println("    "+R+"° Rankine a Réaumur es: "+operar+"°");
                    System.out.println("");
                }
                case 17 ->{
                    cambio = false;
                }
            }
        }while (cambio);


    }
}