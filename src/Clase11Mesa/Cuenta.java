package Clase11Mesa;

public abstract class Cuenta {
    private double saldoTotal = 0.0;
//    private Cliente clientes;

    public Cuenta(double saldoTotal) {
        this.saldoTotal = saldoTotal;
//        this.clientes = clientes;
    }

    public void depositar(double depositado) {
    this.saldoTotal = this.saldoTotal + depositado;
    }
public abstract void extraer(double extracto);

    public double informarSaldo() {
        return this.saldoTotal;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

//    public Cliente getClientes() {
//       return clientes;
//    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

//   public void setClientes(Cliente clientes) {
//       this.clientes = clientes;
//    }
}
