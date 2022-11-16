package Clase11Mesa;

public class CuentaConmitente extends Cuenta{
    private String cnv;
    public CuentaConmitente(double saldoTotal) {
        super(saldoTotal);
    }
    public CuentaConmitente(double saldoTotal, String cnv) {
        super(saldoTotal);
        this.cnv = cnv;
    }
        public void depositar(double depositado){
            setSaldoTotal(getSaldoTotal()+ (depositado - (( 1* depositado) / 100 )));

        }


            public void extraer(double extracto) {
                if (extracto <= getSaldoTotal()/2) {
                    setSaldoTotal(getSaldoTotal() - extracto);
                } else if (cnv != "" && extracto <= getSaldoTotal() ) {
                        setSaldoTotal(getSaldoTotal() - extracto);
                }
                else {
                    System.out.println("No es posible realizar la operacion, su saldo no es suficiente");
                }

            }

        }


