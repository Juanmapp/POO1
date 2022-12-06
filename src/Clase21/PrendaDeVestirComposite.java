package Clase21;

import java.util.ArrayList;

public class PrendaDeVestirComposite extends Producto {
    private ArrayList<Producto> materiales = new ArrayList();
    private double costoDeManoDeObra;

    public void agregarMaterial (Producto producto) {
        this.materiales.add(producto);
    }
    public void quitarMaterial (Producto producto) {
        this.materiales.remove(producto);
    }
    public String mostarMateriales() {
        String listaDeMateriales = "";
        for (int i = 0 ; i < this.materiales.size(); i++) {
            listaDeMateriales = "\n " + (i+1) + ". " + this.materiales.get(i).getNombre() + " " + this.materiales.get(i).getColor();
        }
        return listaDeMateriales;
    }
    @Override
    public double calcularPrecio() {
        double precioTotal = 0.0;
        for (Producto producto : this.materiales) {
            precioTotal += producto.calcularPrecio();
        }
        return precioTotal + this.costoDeManoDeObra;
    }

    public double calcularPrecio(double porcentajeDeDescuento) {
        return this.calcularPrecio() - (this.calcularPrecio() / 100 * porcentajeDeDescuento);

    }

    public ArrayList<Producto> getMateriales() {
        return materiales;
    }

    public void setMateriales(ArrayList<Producto> materiales) {
        this.materiales = materiales;
    }

    public double getCostoDeManoDeObra() {
        return costoDeManoDeObra;
    }

    public void setCostoDeManoDeObra(double costoDeManoDeObra) {
        this.costoDeManoDeObra = costoDeManoDeObra;
    }
}
