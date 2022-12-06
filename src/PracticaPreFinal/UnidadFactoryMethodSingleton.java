package PracticaPreFinal;public class UnidadFactoryMethodSingleton {
    private static UnidadFactoryMethodSingleton instancia;
    private UnidadFactoryMethodSingleton( ){};
    public static UnidadFactoryMethodSingleton obtenerInstancia () {
        if (UnidadFactoryMethodSingleton.instancia == null) {
            UnidadFactoryMethodSingleton.instancia = new UnidadFactoryMethodSingleton();
        }
        return UnidadFactoryMethodSingleton.instancia;
    }
    public Unidad crearUnidad(String tipo) {
        switch (tipo.toUpperCase()) {
            case "SIMPLE":
                return new UnidadSimple();
            case "COMBINADA":
                return new UnidadCombinadaComposite();
        }
        return null;
    }

    public static UnidadFactoryMethodSingleton getInstancia() {
        return instancia;
    }
}
}
