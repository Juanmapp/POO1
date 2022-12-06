package Clase22;

import java.util.ArrayList;

public class CarreraComposite extends OfertaAcademica {
    private double porcentajeDeBonificacion;
    private ArrayList<OfertaAcademica> ofertasAcademicas = new ArrayList();


    public void agregarOfertaAcademica (OfertaAcademica oferta) {
        this.ofertasAcademicas.add(oferta);
    }
    public void quitarOfertaAcademica (OfertaAcademica oferta) {
        this.ofertasAcademicas.remove(oferta);
    }
    @Override
    public double calcularPrecio() {
        double precioCarrera = 0.0;
        for (OfertaAcademica oferta : this.ofertasAcademicas) {
            precioCarrera = precioCarrera + oferta.calcularPrecio();
        }
        return precioCarrera - (precioCarrera /100 * this.porcentajeDeBonificacion);
    }

    public double getPorcentajeDeBonificacion() {
        return porcentajeDeBonificacion;
    }

    public void setPorcentajeDeBonificacion(double porcentajeDeBonificacion) {
        this.porcentajeDeBonificacion = porcentajeDeBonificacion;
    }

    public ArrayList<OfertaAcademica> getOfertasAcademicas() {
        return ofertasAcademicas;
    }

    public void setOfertasAcademicas(ArrayList<OfertaAcademica> ofertasAcademicas) {
        this.ofertasAcademicas = ofertasAcademicas;
    }
}
