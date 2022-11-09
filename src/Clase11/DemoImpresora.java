package Clase11;

public class DemoImpresora {
    public static void main(String[] args) {
        ImpresoraEpson impresora1 = new ImpresoraEpson();
        impresora1.setHojasDisponibles(10);
        impresora1.setPorcentajeTinta(10.0);
        System.out.println("Tiene papel" + impresora1.tienePapel());
        System.out.println("Necesita tinta" + impresora1.necesitaTinta());
        System.out.println(impresora1.imprimir());;
        ImpresoraCannon impresora2 = new ImpresoraCannon();
        impresora1.setHojasDisponibles(5);
        impresora1.setPorcentajeTinta(11.0);
        System.out.println("Tiene papel" + impresora1.tienePapel());
        System.out.println("Necesita tinta" + impresora1.necesitaTinta());
        System.out.println(impresora2.imprimir());;
    }
}
