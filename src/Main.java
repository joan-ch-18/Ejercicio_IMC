import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opc, opc2;
        boolean cambio = true;
        boolean verif1, verif2;
        //Variables para personas
        String n1, a1, d1;
        int e1;
        //Variables para opcion de adoptar
        String docP, plaP;
        //Variables para perros
        String placa, nombre, raza, tamano;
        int edadP;
        boolean estadoPerro = false;
        List<Perro> lstPerros = new ArrayList<>();
        List<Persona> lstPersonas = new ArrayList<>();
        lstPersonas.add(new Persona("Winder","Gonzalez",13,"1010"));
        lstPersonas.add(new Persona("Andres","Velandia",25,"2020"));
        lstPerros.add(new Perro("A1","Lily","Bulldog",7,"32"));
        lstPerros.add(new Perro("A2","Rocky","Pincher",4,"21"));
        System.out.println("    * * * * EJERCICIO ADOPTAR PERROS * * * *");

        do{
            System.out.println("""
                     \n    + + + + MENÚ + + + +
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
                System.out.println("\n    * * * * REGISTRAR PERSONA * * * *");
                System.out.print("    Dígite el nombre de la persona: ");
                n1 = teclado.nextLine();
                System.out.print("    Dígite el apellido de la persona: ");
                a1 = teclado.nextLine();
                System.out.print("    Dígite la edad de la persona: ");
                e1 = teclado.nextInt();
                System.out.print("    Dígite el número de documento de la persona: ");
                d1 = teclado.next();
                lstPersonas.add(new Persona(n1, a1, e1, d1));
                }
                case 2 -> {
                teclado.nextLine();
                System.out.println("\n    * * * * REGISTRAR PERRO * * * *");
                System.out.print("    Dígite la placa del perro: ");
                placa = teclado.nextLine();
                System.out.print("    Dígite el nombre del perro: ");
                nombre = teclado.nextLine();
                System.out.print("    Dígite la raza de del perro: ");
                raza = teclado.nextLine();
                System.out.print("    Dígite la edad del perro (en meses): ");
                edadP = teclado.nextInt();
                System.out.print("    Dígite el tamaño del perro (en centímetros): ");
                tamano = teclado.next();
                lstPerros.add(new Perro(placa, nombre, raza, edadP, tamano));
                }
                case 3 -> {
                    teclado.nextLine();
                    System.out.println("\n    * * * * PERSONAS REGISTRADAS * * * *");
                    System.out.print("""
                                1. Ver Informacion General.
                                2. Ver Informacion Detallada.
                           """);
                    System.out.print("    Dígite la opción que desea: ");
                    opc2 = teclado.nextInt();
                    if(opc2==1){
                        for (Persona persona: lstPersonas){
                            System.out.println(persona);
                        }
                    }if(opc2==2){
                        System.out.println("    Dígite el número de documento: ");
                        String cc = teclado.nextLine();
                        verif1 = false;
                        for (Persona persona : lstPersonas){
                            if(persona.getDocumento().equals(cc)){
                                System.out.println(persona);
                                verif1 =true;
                            }
                        }
                        if(verif1 == false){
                            System.out.println("    No se encontro la persona ");
                        }
                    }
                }
                case 4 -> {
                    teclado.nextLine();
                    System.out.println("\n    * * * * PERROS DISPONIBLES * * * *");
                    System.out.print("""
                                1. Ver Información General.
                                2. Ver Información Detallada.
                           """);
                    System.out.print("    Dígite la opción que desea: ");
                    opc2 = teclado.nextInt();
                    if(opc2==1){
                  for (Perro perro : lstPerros){
                      System.out.println(perro);
                  }
                    }if(opc2==2){
                        System.out.print("    Dígite la placa del perro: ");
                        String placa1 = teclado.next();
                        verif1 = false;
                        for (Perro perro : lstPerros){
                            if(perro.getPlaca().equals(placa1)){
                                System.out.println(perro);
                                verif1 =true;
                            }
                        }
                        if(verif1 == false){
                            System.out.println("    No se encontró el perro ");
                        }
                    }
                }
                case 5 ->{
                    teclado.nextLine();
                    System.out.println("\n    * * * * ADOPTAR UN PERRO * * * *");
                    System.out.print("\n    Dígite el número de documento de la persona que desea adoptar: ");
                    docP = teclado.next();
                    verif1 = false;
                    verif2 = false;
                    for (Persona persona : lstPersonas){
                        if(persona.getDocumento().equals(docP)){
                            System.out.print("\n    Dígite la placa del perro que desea adoptar: ");
                            plaP = teclado.next();
                            verif1 = true;
                            for (Perro perro : lstPerros){
                                if (perro.getPlaca().equals(plaP)){
                                    verif2 = true;
                                    persona.adoptarPerro(perro);
                                }
                        }
                        }
                    }
                    if (verif1 == false){
                        System.out.print("    No se encontró la persona");
                        verif2 = true;
                    }
                    if (verif2 == false){
                        System.out.print("    No se encontró el perro");
                    }
                }
                case 6 -> {
                    teclado.nextLine();
                    System.out.println("\n    * * * * CONSULTAR PERRO MÁS VIEJO * * * *");
                    System.out.println("" +
                            "    1. Perro mas viejo en general " +"\n"+
                            "    2. Perro mas viejo por persona " );
                    System.out.print("    Dígite la opción: ");
                    opc2 = teclado.nextInt();
                    if(opc2==1){
                        if(lstPersonas.size()!=0) {
                            Perro perroGrande=null;
                            int edad=-1;
                            for (Perro perro : lstPerros){
                                if(perro.getEdad()>edad){
                                    edad=perro.getEdad();
                                    perroGrande=perro;
                                }
                            }
                            System.out.println(perroGrande);
                        }else{
                            System.out.println("No hay perros ");
                        }
                    }if(opc2==2){
                        System.out.println("    Dígite el número de documento de la persona : ");
                        String doc= teclado.next();
                        boolean check=false;
                        for(Persona persona : lstPersonas){
                            if(persona.getDocumento().equals(doc)){
                                check=true;
                                if(persona.getlstPerros().size()!=0) {
                                    System.out.println(persona.perroMasGrande());
                                }else{
                                    System.out.println("    No tiene perros adoptados ");
                                }
                            }
                        }if(check==false){
                            System.out.println("    No se encontró la persona ");
                        }
                    }
                }
                default ->{
                    cambio = false;
                }
            }
        }while (cambio);
    }
}