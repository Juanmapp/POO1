public class ArmasCortas extends Arma{

    //Atributo
    private boolean esAutomatica;

    // Constructor

    public ArmasCortas(int cantidadMuniciones, int alcanceEnMetros, String marca, int calibre, String estado, Policia policia) {
        super(cantidadMuniciones, alcanceEnMetros, marca, calibre, estado, policia);
    }

    //metodo

    public boolean saberSiSePuedeDispararAMasDe200M()
    {
        if (this.alcanceEnMetros > 200) {
            return true;
        }
        return false;
    }

    //Getter

    public boolean GetEsAutomatica() {
        return esAutomatica;
    }

    //Setter

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }
}
