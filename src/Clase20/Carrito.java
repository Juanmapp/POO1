package Clase20;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Producto> productos = new ArrayList();

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }
    public double calcularTotalDeCompra() {
        double acumulador = 0;

        for (Producto p : this.productos) {
            acumulador += p.calcularPrecio();
        }
        return acumulador;
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
