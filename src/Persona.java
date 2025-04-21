import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private List<Perro> lstPerros = new ArrayList<>();

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        lstPerros = new ArrayList<Perro>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void lista(){
        List<Perro> lstPerros = new ArrayList<>();
    }

    public void adoptarPerro (Perro perro){
        if (lstPerros.size()>3){
            System.out.println("    No puede adoptar más perros");
        } else {
            lstPerros.add(perro);
        }
    }

    public Perro perroMasGrande (){
            for (int i= 0; i<lstPerros.size(); i++){
                if(lstPerros.get(i).getEdad()){

                }
            }
    }

    @Override
    public String toString() {
        return "\n Nombre='" + nombre +
                "\n Apellido='" + apellido +
                "\n Edad=" + edad +
                "\n Documento='" + documento +
                "\n Perros Adoptados=" + lstPerros;
    }
}
