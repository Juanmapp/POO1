package Clase10Mesas;

public class Objeto {
    private int posx;
    private int posy;
    private char direccion;

    public Objeto(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public int getPosx() {
        return this.posx;
    }

    public int getPosy() {
        return this.posy;
    }

    public char getDireccion() {
        return this.direccion;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }
    public void irA(int x , int y , char direccion) {

    }
}
