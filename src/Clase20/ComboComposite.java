package Clase20;

import java.util.ArrayList;

public class ComboComposite extends Producto {

    private ArrayList<Producto> productos = new ArrayList();
    private final double PORCENTAJE_DE_DESCUENTO = 5.0;


    public ComboComposite(String nombre) {
        super(nombre, 0.0);
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }



    @Override
    public double calcularPrecio() {
        double acumulador = 0;

        for (Producto p : this.productos) {
            acumulador += p.calcularPrecio();
        }
        return acumulador - (acumulador / 100 * this.getPORCENTAJE_DE_DESCUENTO());
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getPORCENTAJE_DE_DESCUENTO() {
        return PORCENTAJE_DE_DESCUENTO;
    }
}