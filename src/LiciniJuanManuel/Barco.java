package LiciniJuanManuel;

import java.util.ArrayList;

public class Barco {
    private int matricula;
    private ArrayList<Carga> cargas = new ArrayList();

    public void agregarCarga(Carga carga) {
        this.cargas.add(carga);
    }
    public void quitarCarga(Carga carga) {
        this.cargas.remove(carga);
    }

    public void mostrarCarga() {
        for (Carga carga: this.cargas ) {
            System.out.println("Nombre de la carga : " + carga.getNombre() + ", peso : " + carga.calcularPeso());
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Carga> getCargas() {
        return cargas;
    }

}
