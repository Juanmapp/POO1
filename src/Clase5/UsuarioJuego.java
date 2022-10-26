package Clase5;

public class UsuarioJuego {
    //atributos
    private String nombre;
    private String clave;
    private Double puntaje = 0.0;
    private int nivel = 0;

    //constructor
    public UsuarioJuego(String nombre , String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    //metodos
    public void aumentarPuntaje() {
        this.puntaje += 1 ;
    }
    public void subirNivel() {
        this.nivel += 1 ;
    }
    public void bonus(double valorBonus) {
    this.puntaje +=(double)valorBonus;
    }

    public Double getPuntaje() {
        return this.puntaje;
    }
    public int getNivel() {
        return this.nivel;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void imprimrDatos() {
        System.out.println(this.nombre + " \n" +
                "nivel : " + this.nivel + "\n" +
                "puntaje : " + this.puntaje);
    }

}