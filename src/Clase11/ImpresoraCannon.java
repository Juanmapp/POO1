package Clase11;

public class ImpresoraCannon extends Impresora {
    @Override
    public boolean necesitaTinta() {
        if (this.getPorcentajeTinta() <= 10.0) {
            return true;
        } else {
            return false;
        }
    }
    public String imprimir() {
        if (this.tienePapel() == true && this.necesitaTinta() ==false) {
            return "imprimiendo desde cannon...";
        } else {
            return "Nose puede imprimir desde cannon...";
        }
    }
}
