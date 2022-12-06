package Clase22;

public class Curso extends OfertaAcademica{
    private int cargaHoraria;
    private double valorHora;
    private int mesesDuracion;

    @Override
    public double calcularPrecio() {
        return this.cargaHoraria * this.mesesDuracion * this.valorHora;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getMesesDuracion() {
        return mesesDuracion;
    }

    public void setMesesDuracion(int mesesDuracion) {
        this.mesesDuracion = mesesDuracion;
    }
}
