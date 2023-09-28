package utnfrc.isi.back.ejercicioclase.model;

public class Estudiante {
    private int legajo;

    private String Nombre;

    private String Apellido;

    public int getLegajo() {
        return legajo;
    }

    public Estudiante(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        Nombre = nombre;
        Apellido = apellido;
    }

    public Estudiante() {}

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "legajo=" + legajo +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }
}
