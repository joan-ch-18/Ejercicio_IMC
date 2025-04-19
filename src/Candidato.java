public class Candidato {
    private String nombre;
    private int votosInternet;
    private int votosRadio;
    private int votosTV;
    private int costoInternet = 700000;
    private int costoRadio = 200000;
    private int costoTV = 600000;

    public Candidato() {
    }

    public Candidato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void votar(int medio) {
        switch (medio) {
            case 1 -> votosInternet++;
            case 2 -> votosRadio++;
            case 3 -> votosTV++;
        }
    }

    public int getTotalVotos() {
        return votosInternet + votosRadio + votosTV;
    }

    public int getCostoCampana() {
        return (votosInternet * costoInternet) +
                (votosRadio * costoRadio) +
                (votosTV * costoTV);
    }

    public void reiniciarVotos() {
        votosInternet = 0;
        votosRadio = 0;
        votosTV = 0;
    }

    public double getPorcentaje(int totalVotos) {
        if (totalVotos > 0) {
            double porcentaje = (getTotalVotos() * 100.0) / totalVotos;
            return porcentaje;
        } else {
            return 0;
        }
    }

    public String mostrarInfo() {
        return nombre +
                "\n  Total votos: " + getTotalVotos() +
                "\n  Costo campaña: $" + getCostoCampana();
    }
}
