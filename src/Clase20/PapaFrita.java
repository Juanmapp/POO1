package Clase20;

public class PapaFrita extends Producto{


    public PapaFrita(String nombre, double costo) {
        super(nombre, costo);
    }

    @Override
    public double calcularPrecio() {
        return this.getCosto() + ( this.getCosto()/100 * this.getPORCENTAJE_DE_GANANCIA());
    }
}
