public class ArmasLargas extends Arma implements Comparable<ArmasLargas>{

    //Atributos

    private boolean tieneSelloDelRenar;
    private String descripcion;
    private int nivelArma;

    // Constructor

    public ArmasLargas(int cantidadMuniciones, int alcanceEnMetros, String marca, int calibre, String estado, Policia policia) {
        super(cantidadMuniciones, alcanceEnMetros, marca, calibre, estado, policia);
    }

    //Getters

    public boolean getTieneSelloDelRenar() {
        return tieneSelloDelRenar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNivelArma() {
        return nivelArma;
    }

    //Setters

    public void setTieneSelloDelRenar(boolean tieneSelloDelRenar) {
        this.tieneSelloDelRenar = tieneSelloDelRenar;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNivelArma(int nivelArma) {
        this.nivelArma = nivelArma;
    }

    @Override
    public int compareTo(ArmasLargas arma) {
        if (this.nivelArma > arma.getNivelArma()) {
            return 1;
        } else if (this.nivelArma < arma.getNivelArma()) {
            return -1;
        }
        return 0;
    }
}
