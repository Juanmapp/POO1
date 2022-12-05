package Clase21;

import Clase21.Producto;

public class Boton extends Producto {


    @Override
    public double calcularPrecio() {
        return this.getCosto() + (this.getCosto() /100 * this.getPORCENTAJE_DE_GANANCIA());
    }
}
