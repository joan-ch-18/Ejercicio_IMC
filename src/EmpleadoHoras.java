public class EmpleadoHoras extends Empleado{
    private int salarioHora = 98000;
    private int horasTrabajadas;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(String nombre, int edad, int salarioHora, int horasTrabajadas) {
        super(nombre, edad);
        this.salarioHora = salarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getSalarioHora() {
        return salarioHora;
    }
    public void setSalarioHora(int salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String MostrarInfo() {
        return
                "   Nombre:" + nombre + '\n' +
                        "   Edad:" + edad + '\n' +
                        "   Horas Trabajadas: " + horasTrabajadas + " hr" +'\n' +
                        "   Pago por Hora ($98.000): $" + salarioHora*horasTrabajadas + " COP" + '\n';

    }
}
