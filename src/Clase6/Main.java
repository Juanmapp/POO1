package Clase6;

public class Main {
    public static void main(String[] args) {
        Institucion perro1 = new Institucion("cacho", false, "pitbull", 2019, 5.2, true, false );
        System.out.println(perro1.edad());
        System.out.println(perro1.enAdopcion());
        System.out.println(perro1.getAdopcion1());
        System.out.println(perro1.sePuedePerder());
    }
}
