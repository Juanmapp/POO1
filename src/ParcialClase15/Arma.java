import java.util.Objects;

public abstract class Arma {

    //Atributos
    protected int cantidadMuniciones;
    protected int alcanceEnMetros;
    protected  String marca;
    protected  int calibre;
    protected  String estado;
    protected Policia policia;

    // Constructor

    public Arma(int cantidadMuniciones, int alcanceEnMetros, String marca, int calibre, String estado, Policia policia) {
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceEnMetros = alcanceEnMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.policia = new Policia("", "", 0);
    }

    //metodo

    public boolean poderSerUsada() {
        if (this.estado.equals("EN USO") && this.calibre >=9 ) {
            return true;
        }
        return false;
    }

    //Getters

    public int getCantidadMuniciones() {
        return cantidadMuniciones;
    }

    public int getAlcanceEnMetros() {
        return alcanceEnMetros;
    }

    public String getMarca() {
        return marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

    public Policia getPolicia() {
        return policia;
    }
    //Setters

    public void setCantidadMuniciones(int cantidadMuniciones) {
        this.cantidadMuniciones = cantidadMuniciones;
    }

    public void setAlcanceEnMetros(int alcanceEnMetros) {
        this.alcanceEnMetros = alcanceEnMetros;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPolicia(Policia policia) {
        this.policia = policia;
    }
}

