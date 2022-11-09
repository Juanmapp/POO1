package Clase11Mesa;

public class DemoBanco {
    public static void main(String[] args) {
        CajaDeAhorro caja1 = new CajaDeAhorro(200.00);
        caja1.extraer(250.0);
        System.out.println(caja1.getSaldoTotal());
    }
}
