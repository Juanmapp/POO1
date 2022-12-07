package LiciniJuanManuel;

public class DemoBarco {
    public static void main(String[] args) {

        CargaFactoryMethodSingleton barco = CargaFactoryMethodSingleton.obtenerInstancia();

        CargaSimple televisor = (CargaSimple) barco.crearCarga("SIMPLE");
        televisor.setNombre("TV 32” LED");
        televisor.setPesoDeLaCarga(3.0);
        televisor.setNecesitaRefrigeracion(false);
        System.out.println(televisor.calcularPeso());

        CargaSimple medicamentos = (CargaSimple) barco.crearCarga("SIMPLE");
        medicamentos.setNombre("Caja de medicamentos");
        medicamentos.setPesoDeLaCarga(2.0);
        medicamentos.setNecesitaRefrigeracion(true);
        System.out.println(medicamentos.calcularPeso());

        Contenedor contenedor = (Contenedor) barco.crearCarga("CONTENEDOR");
        contenedor.setNombre("Contenedor chico");
        contenedor.setPesoContenedor(100.0);
        contenedor.agregarCarga(televisor);
        contenedor.agregarCarga(medicamentos);
        System.out.println(contenedor.calcularPeso());

        Barco barco1 = new Barco();
        barco1.agregarCarga(contenedor);
        barco1.mostrarCarga();

    }
}
