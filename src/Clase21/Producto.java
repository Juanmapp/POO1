package Clase21;

public abstract class Producto {
    private String nombre;
    private String color;
    private double costo;

    private final double PORCENTAJE_DE_GANANCIA = 30.0;

    public abstract double calcularPrecio() ;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPORCENTAJE_DE_GANANCIA() {
        return PORCENTAJE_DE_GANANCIA;
    }
}
