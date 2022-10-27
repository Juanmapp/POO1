package Clase6;

public class Institucion {
    //ATRIBUTOS
        private String nombrePila;
    private boolean adopcion1;
    private String raza;
    private int anioAproxNacimiento;
    private double peso;
    private boolean chip;
    private boolean herido;

    //CONSTRUCTOR
    public Institucion(String nombrePila, boolean adopcion1, String raza, int anioAproxNacimiento, double peso, boolean chip, boolean herido) {
        this.nombrePila = nombrePila;
        this.adopcion1 = adopcion1;
        this.anioAproxNacimiento = anioAproxNacimiento;
        this.peso = peso;
        this.chip = chip;
        this.herido = herido;
    }

    //METODOS
    public int edad() {
        return 2022 - anioAproxNacimiento;
    }
    public String sePuedePerder() {
        if (chip) {
            return "El perro tiene chip, por lo que no puede perderse";
        }
        else {
            return "El perro puede perderse ya que no tiene chip";
        }
    }
    public String enAdopcion() {
        if (!this.herido && this.peso > 5.0 ) {
            this.adopcion1 = true;
            return "Este perro puede ser adoptado" ;
        } else {
            return "Este perro no puede ser adoptado";
        }
    }
    //GETTER Y SETTER
    public String getNombrePila() { return this.nombrePila;}
    public boolean getAdopcion1() { return this.adopcion1;}
    public String getRaza() { return this.raza;}
    public int getAnioAproxNacimiento() { return this.anioAproxNacimiento;}
    public double getPeso() { return this.peso;}
    public boolean getChip() { return this.chip;}
    public boolean getHerido() { return this.herido;}


}
