package Clase21;

public class ProductoFactoryMethodSingleton {
    private static ProductoFactoryMethodSingleton instancia;
    private ProductoFactoryMethodSingleton() {}
    public  static ProductoFactoryMethodSingleton obtenerInstancia() {
        if (ProductoFactoryMethodSingleton.instancia == null) {
            ProductoFactoryMethodSingleton.instancia = new ProductoFactoryMethodSingleton();
        }
        return ProductoFactoryMethodSingleton.instancia;
    }
    public Producto crearProducto(String tipo) {
        switch(tipo.toUpperCase()) {
                case "BOTON":
                return new Boton();
                case "HILO":
                return new Hilo();
                case "TELA":
                return new Tela();
                case "PRENDA":
                return new PrendaDeVestirComposite();
        }
        return null;
    }
}
