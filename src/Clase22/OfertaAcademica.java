package Clase22;

public abstract class OfertaAcademica {
    private String nombre;
    private String Descripcion;

    public abstract double calcularPrecio() ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
