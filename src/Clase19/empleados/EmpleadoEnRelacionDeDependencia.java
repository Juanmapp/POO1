package Clase19.empleados;

public class EmpleadoEnRelacionDeDependencia extends Empleado {
    private double salario;
    private final double incentivo= 15.0;
    @Override
    public double calcularSalario() {
        return this.salario + this.incentivo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getIncentivo() {
        return incentivo;
    }

}
