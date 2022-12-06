package Clase14MesaDeTrabajo;

public class Yate extends Embarcacion implements Comparable<Yate>{
    private int cantidadDeCamarotes;

    public Yate(double precioBase, double valorAdicional) {
        super(precioBase, valorAdicional);
    }
    public int compareTo(Yate yate) {
//        int yate1 = this.cantidadDeCamarotes;
//        int yate2 = yate.getCantidadDeCamarotes();
        if (this.cantidadDeCamarotes > yate.getCantidadDeCamarotes()) {
            return 1;
        } else if (this.cantidadDeCamarotes < yate.getCantidadDeCamarotes()) {
            return -1;
        }
        return 0;
    }

    public int getCantidadDeCamarotes() {
        return cantidadDeCamarotes;
    }

    public void setCantidadDeCamarotes(int cantidadDeCamarotes) {
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }
}
