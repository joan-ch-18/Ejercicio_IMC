public class LibroImpreso extends Libro{
    private double peso;

    public LibroImpreso(String titulo, String autor, double precio, double peso) {
        super(titulo, autor, precio);
        this.peso = peso;
    }

    public LibroImpreso() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String MostrarInfo() {
        return
                "   Título: " + titulo + '\n' +
                "   Autor: " + autor + '\n' +
                "   Precio: $" + precio + " COP" + '\n' +
                "   Peso: " + peso + " Gramos" +'\n';

    }

}
