package PracticaPreFinal;

public class UnidadSimple extends Unidad{
    private int cantidadDePersonas;
    private double montoPorPersona;

    @Override
    public double calcularMonto() {
        if (this.cantidadDePersonas > 10) {
            return (this.cantidadDePersonas * this.montoPorPersona)*1.20;
        }
        return this.cantidadDePersonas * this.montoPorPersona;
    }

    @Override
    public String toString() {
        return "UnidadSimple: " + this.getNombre() + ", monto : $" + this.calcularMonto();
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public double getMontoPorPersona() {
        return montoPorPersona;
    }

    public void setMontoPorPersona(double montoPorPersona) {
        this.montoPorPersona = montoPorPersona;
    }

}
