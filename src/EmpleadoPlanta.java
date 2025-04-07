public class EmpleadoPlanta extends Empleado{
    private int salarioFijo = 2100000;

    public EmpleadoPlanta() {
    }

    public EmpleadoPlanta(String nombre, int edad, int salarioFijo) {
        super(nombre, edad);
        this.salarioFijo = salarioFijo;
    }

    public int getSalarioFijo() {
        return salarioFijo;
    }
    public void setSalarioFijo(int salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public String toString() {
        return "EmpleadoPlanta{" +
                "salarioFijo=" + salarioFijo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
