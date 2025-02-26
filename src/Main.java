import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int peso;
        double estatura, imc;


        System.out.println("    ------ ÍNDICE DE MASA CORPORAL ------");
        do{
            System.out.println("    Dígite su peso (en kilogramos) actual: ");
            peso = teclado.nextInt();
        }while(peso<=0);
        do{
            System.out.println("    Dígite su estatura (en metros) actual: ");
            estatura = teclado.nextDouble();
        }while(estatura<=0);

        imc = peso / (estatura*estatura);
        System.out.println("    Su Índice de Masa Corporal es de: " + imc);

        if(imc<=18.49){
            System.out.println("    Según su masa corporal, su clasificación es: BAJO");
        }else if (imc>=18.50 && imc<=24.99){
            System.out.println("    Según su masa corporal, su clasificación es: NORMAL");
        }else if (imc>=25 && imc<=29.99){
            System.out.println("    Según su masa corporal, su clasificación es: SOBREPESO");
        }else if (imc>=30 && imc<=34.99){
            System.out.println("    Según su masa corporal, su clasificación es: OBESIDAD LEVE");
        }else if (imc>=35 && imc<=39.99){
            System.out.println("    Según su masa corporal, su clasificación es: OBESIDAD MEDIA");
        }else{
            System.out.println("    Según su masa corporal, su clasificación es: OBESIDAD MÓRBIDA");
        }

    }
}