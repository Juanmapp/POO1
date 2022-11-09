package Clase11Mesa;

public class CajaDeAhorro extends Cuenta{
    public CajaDeAhorro(double saldoTotal) {
        super(saldoTotal);
    }


    @Override
    public void extraer(double extracto) {
        if (extracto <= getSaldoTotal()) {
             setSaldoTotal(getSaldoTotal() - extracto);
        } else {
            System.out.println("No es posible realizar la operacion, su saldo no es suficiente");
        }

    }
}
