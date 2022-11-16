package Clase14ModeloExamen;

public abstract class Examen {
    protected String titulo;
    protected String enunciado;
    protected double notaEscrita;
    protected Estudiante estudiante;

    public Examen(String titulo, String enunciado) {
        this.titulo = titulo;
        this.enunciado = enunciado;
    }
    public abstract boolean determinarEstadoDeAprovacion();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getNotaEscrita() {
        return notaEscrita;
    }

    public void setNotaEscrita(double notaEscrita) {
        this.notaEscrita = notaEscrita;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }


}
