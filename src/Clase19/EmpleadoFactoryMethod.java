package Clase19;

import Clase19.empleados.Empleado;
import Clase19.empleados.EmpleadoContratadoPorHora;
import Clase19.empleados.EmpleadoEnRelacionDeDependencia;

public class EmpleadoFactoryMethod {
    public Empleado crearEmpleado(String tipo) {
        switch (tipo) {
            case "EMP-RD" :
                return new EmpleadoEnRelacionDeDependencia();
            case "EMP-PH" :
                return new EmpleadoContratadoPorHora();
        }
        return null;

    }
}
