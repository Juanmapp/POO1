package PracticaPreFinal;

import java.util.ArrayList;

public class UnidadCombinadaComposite extends Unidad{
    private ArrayList<Unidad> unidades = new ArrayList();
    private double montoDeMateriales;
    private int coeficienteGlobal;

    public void agregarUnidad(Unidad unidad) {
        this.unidades.add(unidad);
    }
    public void quitarUnidad(Unidad unidad) {
        this.unidades.remove(unidad);
    }

    @Override
    public double calcularMonto() {
        double acumulador = 0.0;
        for ( Unidad u : this.unidades) {
            acumulador = acumulador + u.calcularMonto();

        }
        return acumulador * this.coeficienteGlobal;
    }
}
