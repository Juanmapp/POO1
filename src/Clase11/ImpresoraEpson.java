package Clase11;

public class ImpresoraEpson extends Impresora{

        public String imprimir() {
        if (this.tienePapel() == true && this.necesitaTinta() ==false) {
            return "imprimiendo desde epson...";
        } else {
            return "Nose puede imprimir desde epson...";
        }
    }
}
