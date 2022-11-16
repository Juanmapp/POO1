package Clase14MesaDeTrabajo;

public class Velero extends Embarcacion{
    private int cantidadMastiles;

    public Velero(double precioBase, double valorAdicional) {
        super(precioBase, valorAdicional);
    }
    public boolean evaluarSiEsGrande() {
        if (this.cantidadMastiles > 4) {
            return true;
        } return false;
    }

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }
}
