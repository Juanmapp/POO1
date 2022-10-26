package Clase2;

import java.util.Scanner;

public class Programa2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su Apellido");
        String apellido = scanner.nextLine();


        System.out.println("Ingrese su dia de su fecha de nacimiento");
        int dia = scanner.nextInt();

        System.out.println("Ingrese su mes de su fecha de nacimiento");
        int mes = scanner.nextInt();

        System.out.println("Ingrese su año de su fecha de nacimiento");
        int anio = scanner.nextInt();

        /*character inicialNombre = nombre.charAt(0) ;
        character inicialApellido = apellido.charAt(0);
        String iniciales = inicialNombre.toString() + inicialApellido.toString();
        /*String iniciales = inicialNombre + inicialApellido;
        System.out.println(iniciales);*/

        System.out.println("Ingrese un valor de compra");
        double compra = scanner.nextDouble();

        System.out.println("Ingrese un valor de reventa");
        double reventa = scanner.nextDouble();

        double margenDeGanancia = reventa - compra;
        double margenDeGananciaPorcentual = (100 / reventa) * margenDeGanancia;

        System.out.println("Margen $ " + (int) margenDeGanancia);
        System.out.println("Margen % " + (int) margenDeGananciaPorcentual);



    }
}
