package LiciniJuanManuel;

import java.util.ArrayList;

public class Contenedor extends Carga{
    private double pesoContenedor;
    private ArrayList<Carga> cargas = new ArrayList();


    public void agregarCarga(Carga carga) {
        this.cargas.add(carga);
    }
    public void quitarCarga(Carga carga) {
        this.cargas.remove(carga);
    }
    @Override
    public double calcularPeso() {
        double acumulador = 0.0;
        for (Carga carga : this.cargas) {
            acumulador = acumulador + carga.calcularPeso();
        }
        return acumulador + pesoContenedor;
    }

    public double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    public ArrayList<Carga> getCargas() {
        return cargas;
    }

}
