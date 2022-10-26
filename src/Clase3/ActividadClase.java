package Clase3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ActividadClase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa el nombre del perro");
        String nombreDelPerro = scanner.nextLine();

        System.out.println("ingresa la cantidad de alimento que come tu perro");
        double cantidadDeComida = scanner.nextDouble();
        imprimir(cantidadDeComida, scanner, nombreDelPerro);

    }
    public static void imprimir(double cantidadDeComida, Scanner scanner, String nombreDelPerro) {
        int cantidadDePaquetes = 0;
        double acumulado = 0;
        while (acumulado < cantidadDeComida) {
            System.out.println("ingresa el pesaje del paquete de alimento");
            acumulado += scanner.nextDouble();
            cantidadDePaquetes++;
        }

        System.out.println("resultado = " + nombreDelPerro + " precisa " + cantidadDePaquetes + " paquetes");
    }
}