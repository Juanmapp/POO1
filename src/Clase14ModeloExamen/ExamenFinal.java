package Clase14ModeloExamen;

public class ExamenFinal extends Examen implements Comparable<ExamenFinal> {
    private double notaOral;
    private String descripcionDelTemaDado;

        public ExamenFinal(String titulo, String enunciado) {
        super(titulo, enunciado);
    }

    public boolean determinarEstadoDeAprovacion() {
        if (this.notaEscrita >= 4 && this.notaOral >= 4) {
            return true;
        }
        return false;
    }

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public String getDescripcionDelTemaDado() {
        return descripcionDelTemaDado;
    }

    public void setDescripcionDelTemaDado(String descripcionDelTemaDado) {
        this.descripcionDelTemaDado = descripcionDelTemaDado;
    }

    @Override
    public int compareTo(ExamenFinal examen) {
            double promedio = (this.notaOral + this.notaEscrita) / 2;
            double promedio2 = (examen.getNotaOral() + examen.getNotaEscrita()) / 2;

        if (promedio > promedio2) {
            return 1;
        } else if (promedio < promedio2) {
            return -1;
        }
        return 0;
    }
}
