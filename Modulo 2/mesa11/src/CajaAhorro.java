public class CajaAhorro extends Cuenta{
    private Float interes;

    public CajaAhorro(Double saldo, Cliente cliente, Float interes) {
        super(saldo, cliente);
        this.interes = interes;
    }

    @Override
    public void extraer(Double monto) {
        if(super.informar() >= monto){
            super.depositar(-monto);
            System.out.println("Su extracciojn fue realizada ");
        }
    }
}
