package Clase11Mesa;

public class CuentaCorriente extends Cuenta {
    private double montoAutorizadoDeGiro;

    public CuentaCorriente(double saldoTotal, double montoAutorizadoDeGiro) {
        super(saldoTotal);
    }
        public void depositar ( double depositado){
            setSaldoTotal(getSaldoTotal() + depositado);

        }

        public void extraer ( double extracto){
            if (extracto <= getSaldoTotal() + this.montoAutorizadoDeGiro  ) {
                setSaldoTotal(getSaldoTotal() - extracto);
            } else {
                System.out.println("No es posible realizar la operacion, su saldo no es suficiente");
            }

        }
    }


