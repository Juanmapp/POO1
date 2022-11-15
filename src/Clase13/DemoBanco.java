package Clase13;

public class DemoBanco {
    public static void main(String[] args) {


        CuentaConmitente cliente1 = new CuentaConmitente(1000);
        CuentaConmitente cliente2 = new CuentaConmitente(1000, "clave");
        cliente1.extraer(500,"");
        cliente2.extraer(1000,"clave");
        System.out.println(cliente1.getSaldoTotal());
        System.out.println(cliente2.getSaldoTotal());




    }
}
