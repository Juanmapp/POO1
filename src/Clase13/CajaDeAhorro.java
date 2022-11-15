package Clase13;

public class CajaDeAhorro extends Cuenta implements ImpuestoGravable{
    public CajaDeAhorro(double saldoTotal) {
        super(saldoTotal);
    }

    public void depositar(double depositado){
        setSaldoTotal(getSaldoTotal()+ depositado);

    }

    public void extraer(double extracto) {
        if (extracto <= getSaldoTotal()) {
             setSaldoTotal(getSaldoTotal() - extracto);
        } else {
            System.out.println("No es posible realizar la operacion, su saldo no es suficiente");
        }

    }


    public double gravar(double porcentajeDelImpuesto) {
        return (this.getSaldoTotal() / 100 * porcentajeDelImpuesto);
    }
}
