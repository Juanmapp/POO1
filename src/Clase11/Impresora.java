package Clase11;

import java.util.Date;

public abstract class Impresora {
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;

    public boolean tienePapel() {
        if (this.hojasDisponibles > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean necesitaTinta() {
        if (this.porcentajeTinta <= 5.0) {
            return true;
        } else {
            return false;
        }


    }
    public abstract String imprimir();

    public String getModelo() {
        return modelo;
    }

    public String getTipoConexion() {
        return this.tipoConexion;
    }

    public Date getFechaFabricacion() {
        return this.fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return this.hojasDisponibles;
    }

    public double getPorcentajeTinta() {
        return this.porcentajeTinta;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public void setPorcentajeTinta(double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }

}
