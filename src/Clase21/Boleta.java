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

    public String mostrarProductos() {
        String listaDeProductos = "";
        for (int i = 0 ; i < this.productos.size(); i++) {
            listaDeProductos = "\n " + (i+1) + ". " + this.productos.get(i).getNombre() + " " + this.productos.get(i).getColor();
        }
        return listaDeProductos;
    }
    public double calcularTotal() {
        double totalDeLaCompra = 0;
        for (Producto producto : this.productos) {
            totalDeLaCompra = totalDeLaCompra + producto.calcularPrecio();
        }
        return totalDeLaCompra;
    }
    public void finalizar () {
        if (this.productos.size() > 0) {
            this.fecha = LocalDate.now();
            this.estaPagada = true;

        }

    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public boolean isEstaPagada() {
        return estaPagada;
    }
}
