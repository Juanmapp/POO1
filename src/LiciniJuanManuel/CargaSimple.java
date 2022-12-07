package LiciniJuanManuel;

public class CargaSimple extends Carga{

    private double pesoDeLaCarga;
    private boolean necesitaRefrigeracion;


    @Override
    public double calcularPeso() {
        if (necesitaRefrigeracion == true) {
            return this.pesoDeLaCarga + 2.0;
        }
        return this.pesoDeLaCarga;
    }

    public double getPesoDeLaCarga() {
        return pesoDeLaCarga;
    }

    public void setPesoDeLaCarga(double pesoDeLaCarga) {
        this.pesoDeLaCarga = pesoDeLaCarga;
    }

    public boolean isNecesitaRefrigeracion() {
        return necesitaRefrigeracion;
    }

    public void setNecesitaRefrigeracion(boolean necesitaRefrigeracion) {
        this.necesitaRefrigeracion = necesitaRefrigeracion;
    }
}
