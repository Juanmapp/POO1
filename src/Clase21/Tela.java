package Clase21;

public class Tela extends Producto {


    @Override
    public double calcularPrecio() {
        return this.getCosto() + (this.getCosto() /100 * this.getPORCENTAJE_DE_GANANCIA());
    }
}
