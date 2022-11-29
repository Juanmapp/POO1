package Clase19.empleados;

import Clase19.empleados.Empleado;

public class EmpleadoContratadoPorHora extends Empleado {
    private double importePorHora;
    private double cantidadDehorasTrabajadas;


    @Override
    public double calcularSalario() {
        return this.importePorHora * this.cantidadDehorasTrabajadas;
    }

    public double getImportePorHora() {
        return importePorHora;
    }

    public void setImportePorHora(double importePorHora) {
        this.importePorHora = importePorHora;
    }

    public double getCantidadDehorasTrabajadas() {
        return cantidadDehorasTrabajadas;
    }

    public void setCantidadDehorasTrabajadas(double cantidadDehorasTrabajadas) {
        this.cantidadDehorasTrabajadas = cantidadDehorasTrabajadas;
    }
}
