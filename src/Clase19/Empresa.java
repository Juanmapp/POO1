package Clase19;

import Clase19.empleados.Empleado;

import java.util.ArrayList;

public class Empresa {
    private String nombreDeFantasia;
    private ArrayList<Empleado> empleados;

    public double calcularTotalDeSalarios(){
      double total = 0.0;
      return total;
    }
    public Empresa(String nombreDeFantasia) {
        this.nombreDeFantasia = nombreDeFantasia;
    }

    public String getNombreDeFantasia() {
        return nombreDeFantasia;
    }

    public void setNombreDeFantasia(String nombreDeFantasia) {
        this.nombreDeFantasia = nombreDeFantasia;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
