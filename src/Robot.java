public class Robot extends Batería{
    Batería bateriaRobot = new Batería();
    private boolean estadoR = true;
    private String nombre;

    public void avanzar (int pasos){
        if (pasos == 100){
            super.carga = carga - 10;
        }
        System.out.println("    El robot ha avanzado 100 pasos, y consumió 10 de energía.");
    }
    public void retroceder (int pasos){
        if (pasos == 100){
            super.carga = carga - 10;
        }
        System.out.println("    El robot ha retrocedido 100 pasos, y consumió 10 de energía.");
    }
    public void dormir(){
        estadoR = false;
        System.out.println("    El robot se ha dormido.");
    }
    public void despertar(){
        estadoR = true;
        System.out.println("    El robot se ha despertado.");
    }
    public void recargar(){
        super.carga = 1000;
        System.out.println("    El robot esta cargado completamente.");
    }
    public boolean bateriaLlena(){
        if (bateriaRobot.getCarga() == 1000){
            System.out.println("    El robot tiene la batería llena.");
            return true;
        } else {
            return false;
        }
    }
    public boolean bateriaVacia(){
        if (bateriaRobot.getCarga() == 0){
            System.out.println("    El robot tiene la batería vacía.");
            return true;
        } else {
            return false;
        }
    }
    public void energiaActual(){
        System.out.println("    La energía actual del robot es: " + super.carga);
    }
    public String estaDormido(boolean e){
        if(estadoR == false){
            return "    El robot está dormido";
        } else {
            return "";
        }
    }
}
