import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        class CuentaBancaria {
            private String nombre;
            private double saldo;

            public CuentaBancaria(String nombre, double saldoInicial) {
                this.nombre = nombre;
                this.saldo = Math.max(saldoInicial, 0);
            }

            public void depositar(double cantidad) {
                if (cantidad > 0) {
                    saldo += cantidad;
                    System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                } else {
                    System.out.println("La cantidad a depositar debe ser mayor a 0.");
                }
            }

            public void retirar(double cantidad) {
                if (cantidad > 0 && cantidad <= saldo) {
                    saldo -= cantidad;
                    System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                } else if (cantidad <= 0) {
                    System.out.println("La cantidad a retirar debe ser mayor a 0.");
                } else {
                    System.out.println("Fondos insuficientes.");
                }
            }

            public void mostrarSaldo() {
                System.out.println("Saldo actual de " + nombre + ": $" + saldo);
            }
        }

        boolean opcion = true;
        double cantidad;

        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = teclado.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(nombre, saldoInicial);

        do {
            System.out.println("""
                    \n--- Menú de Cuenta Bancaria ---
                    1. Depositar dinero
                    2. Retirar dinero
                    3. Consultar saldo
                    4. Salir
                    Dígite una opción válida: 
                    """);
            int seleccion = teclado.nextInt();

            switch (seleccion) {
                case 1->{
                    System.out.print("Ingrese la cantidad a depositar: ");
                    cantidad = teclado.nextDouble();
                    cuenta.depositar(cantidad);
                }
                case 2->{
                    System.out.print("Ingrese la cantidad a retirar: ");
                    cantidad = teclado.nextDouble();
                    cuenta.retirar(cantidad);
                }
                case 3-> {
                    cuenta.mostrarSaldo();
                }
                case 4-> {
                    opcion = false;
                }
            }
        } while (opcion);
    }
}
