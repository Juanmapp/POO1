package Clase14ModeloExamen;

public class ExamenParcial extends Examen {
    private int numeroDeUnidad;
    private int numeroDeReintentos;

    public ExamenParcial(String titulo, String enunciado) {
        super(titulo, enunciado);
    }

    public boolean determinarEstadoDeAprovacion() {
        if (this.notaEscrita >= 4) {
            return true;
        }
        return false;
    }


    public boolean determinarPosibilidadDeRecuperatorio() {
        if (this.numeroDeUnidad <= 3 && this.numeroDeReintentos < 3) {
            this.numeroDeReintentos++;
            return true;
        } else if (this.numeroDeUnidad > 3 && this.numeroDeReintentos < 2) {
            return true;
        }
        return false;
    }

    public int getNumeroDeUnidad() {
        return numeroDeUnidad;
    }

    public void setNumeroDeUnidad(int numeroDeUnidad) {
        this.numeroDeUnidad = numeroDeUnidad;
    }

    public int getNumeroDeReintentos() {
        return numeroDeReintentos;
    }

    public void setNumeroDeReintentos(int numeroDeReintentos) {
        this.numeroDeReintentos = numeroDeReintentos;
    }
}
