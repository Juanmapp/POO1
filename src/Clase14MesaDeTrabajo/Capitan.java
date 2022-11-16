package Clase14MesaDeTrabajo;

public class Capitan {
    private String nombre;
    private String apellido;
    private int matricula;
    private Embarcacion embarcacion;

    public Capitan(String nombre, String apellido, int matricula, Embarcacion embarcacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.embarcacion = embarcacion;
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Embarcacion getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(Embarcacion embarcacion) {
        this.embarcacion = embarcacion;
    }
}
