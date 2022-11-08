package Clase10Mesas;

public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

}
