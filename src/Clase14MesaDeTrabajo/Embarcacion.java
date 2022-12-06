package Clase14MesaDeTrabajo;

import java.util.Date;

public abstract class Embarcacion {

    protected double precioBase;
    protected double valorAdicional;
    protected int anioFabricacion;
    protected double eslora;
    protected Capitan capitan;


    public Embarcacion(double precioBase, double valorAdicional) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
    }
    public double calcularAlquiler() {
        if (anioFabricacion > 2020) {
            return precioBase + valorAdicional;
        } return precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }
}
