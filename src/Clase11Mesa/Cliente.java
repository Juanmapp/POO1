package Clase11Mesa;

public class Cliente {
    private int numero;
    private String apellido;
    private int dni;
    private int cuit;

    public Cliente(int numero, String apellido, int dni, int cuit) {
        this.numero = numero;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getDni() {
        return this.dni;
    }

    public int getCuit() {
        return this.cuit;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
}
