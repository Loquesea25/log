public class Estudiante {
    private String nombre;
    private int edad;
    private int codigo;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int codigo) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


}
