import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc, producto, c1=0, c2=0, c3=0, c4=0, c5=0;
        String p1 = "Mouse", p2 = "Teclados", p3 = "Monitores", p4 = "Discos Duros", p5 = "USB";
        String nombre, celuco;
        double valorCompra1=0, valorCompra2=0, valorCompra3=0, valorCompra4=0, valorCompra5=0;
        double v1=85000, v2= 230000, v3= 940000, v4= 220000, v5= 60000;
        boolean cambio = true;

        System.out.println("    Dígite su nombre para continuar: ");
        nombre = teclado.next();
        System.out.println("    Ahora dígite su número de telefono: ");
        celuco = teclado.next();

        do{
            System.out.println("""
                    * * * MENÚ TIENDA DE TECNOLOGÍA * * *
                    1. Comprar.
                    2. Calcular compra.
                """);
            System.out.println("    Dígite la opción que desea elegir: ");
            opc = teclado.nextInt();

            switch (opc){
                case 1 -> {
                    System.out.println("""
                            + + + COMPRAR PRODUCTOS + + +
                               Producto   |  Valor
                            1. Mouse      | $85.000
                            2. Teclado    | $230.000
                            3. Monitor    | $940.000
                            4. Disco Duro | $220.000
                            5. USB        | $60.000
                        """);
                System.out.println("    Dígite el número del producto que desea comprar: ");
                producto = teclado.nextInt();
                if(producto == 1){
                    System.out.println("    ¿Cuántos "+p1+" desea comprar?");
                    c1 = teclado.nextInt();
                    valorCompra1 = c1 * v1;
                } else if (producto == 2) {
                    System.out.println("    ¿Cuántos "+p2+" desea comprar?");
                    c2 = teclado.nextInt();
                    valorCompra2 = c2 * v2;
                } else if (producto == 3) {
                    System.out.println("    ¿Cuántos "+p3+" desea comprar?");
                    c3 = teclado.nextInt();
                    valorCompra3 = c3 * v3;
                } else if (producto == 4) {
                    System.out.println("    ¿Cuántos "+p4+" desea comprar?");
                    c4 = teclado.nextInt();
                    valorCompra4 = c4 * v4;
                } else if (producto == 5) {
                    System.out.println("    ¿Cuántas "+p5+" desea comprar?");
                    c5 = teclado.nextInt();
                    valorCompra5 = c5 * v5;
                }
                }
                case 2 -> {
                    double valorTotal=(valorCompra1+valorCompra2+valorCompra3+valorCompra4+valorCompra5);
                    double iva = 0.16;
                    double valorT=(valorTotal+(valorTotal*iva));
                    System.out.println("    - - - - FACTURA DE VENTA - - - -");
                    System.out.println("    Nombre: "+nombre+"  Telefono: "+celuco);
                    System.out.println("    Producto | Cantidad | v/unit | v/total");
                    System.out.println("    "+p1+" | "+c1+" | "+v1+" | "+valorCompra1);
                    System.out.println("    "+p2+" | "+c2+" | "+v2+" | "+valorCompra2);
                    System.out.println("    "+p3+" | "+c3+" | "+v3+" | "+valorCompra3);
                    System.out.println("    "+p4+" | "+c4+" | "+v4+" | "+valorCompra4);
                    System.out.println("    "+p5+" | "+c5+" | "+v5+" | "+valorCompra5);
                    System.out.println("");
                    System.out.println("    V/Total sin Iva: "+valorTotal);
                    System.out.println("            IVA 16%: "+(valorTotal*iva));
                    System.out.println("              TOTAL: "+valorT);
                    cambio = false;
                }
            }
        }while(cambio);

    }
}