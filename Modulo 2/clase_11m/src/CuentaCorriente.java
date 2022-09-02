public class CuentaCorriente extends Cuenta {
    private Double montoParaGirar;

    public CuentaCorriente(Double saldo, Cliente cliente, Double montoParaGirar) {
        super(saldo, cliente);
        this.montoParaGirar = montoParaGirar;
    }


    @Override
    public void extraer(Double monto) {
        if(super.informar() > monto){
            super.extraer(monto);
            System.out.println("retiraste con tu saldo solamente");
        }else if(super.informar() + this.montoParaGirar > monto){
            this.montoParaGirar -= (monto - super.informar());
            super.extraer(super.informar());
            System.out.println("retiraste con el saldo para girar");
        }else {
            System.out.println("No podes retirar");
        }
    }
}
