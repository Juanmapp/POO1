package Clase21;

import java.time.LocalDate;
import java.util.ArrayList;

public class Boleta {

    private ArrayList<Producto> productos = new ArrayList();
    private LocalDate fecha;
    private boolean estaPagada = false;

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
    public void quitarProducto(Producto producto) {
        this.productos.remove(producto);
    }

}
