public class LibroDigital extends Libro{
    private double tamanioArchivo;

    public LibroDigital(String titulo, String autor, double precio, double tamanioArchivo) {
        super(titulo, autor, precio);
        this.tamanioArchivo = tamanioArchivo;
    }

    public LibroDigital() {
    }

    public double getTamanioArchivo() {
        return tamanioArchivo;
    }

    public void setTamanioArchivo(double tamanioArchivo) {
        this.tamanioArchivo = tamanioArchivo;
    }

    public String MostrarInfo() {
        return
                "   Título:" + titulo + '\n' +
                "   Autor:" + autor + '\n' +
                "   Precio: $" + precio + " COP" +'\n' +
                "   Tamaño Archivo: " + tamanioArchivo + " MB" + '\n';

    }
}
