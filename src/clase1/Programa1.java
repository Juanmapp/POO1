package clase1;

import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {


        System.out.println("Hola Mundo");

        String nombreDeCaballo = "Braulio";
        double loQueProduce = 1250.40;
        String razaDeCaballo = "Criollo";

        System.out.println("El caballo del granjero se llama " + nombreDeCaballo + " , que produce " + loQueProduce + ". Su raza es " + razaDeCaballo);


        Integer valor1 = 10;
        Integer valor2 = 30;
        int comparar;
        if (valor1.equals(valor2))
            System.out.println("Son iguales");
        else {
            comparar = valor1.compareTo(valor2);
            System.out.println(comparar);
            if (comparar > 0)
                System.out.println("valor1 es mayor que valor2");
            else
                System.out.println("valor2 es mayor que valor1");

            Scanner scanner;
            scanner = new Scanner(System.in);
            int num1;
            int num2;
            float coeficiente;
            String nombre;
            char inicial;


            System.out.println("Ingrese primer valor");
            num1= scanner.nextInt();
            System.out.println("Ingrese segundo valor");
            num2= scanner.nextInt();
            System.out.println("Ingrese el coeficiente");
            coeficiente= scanner.nextFloat();
        }

    }
}
