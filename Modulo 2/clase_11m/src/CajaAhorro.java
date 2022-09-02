public class CajaAhorro extends Cuenta{
    private Float interes;

    public CajaAhorro(Double saldo, Cliente cliente, Float interes) {
        super(saldo, cliente);
        this.interes = interes;
    }


    @Override
    public void extraer(Double monto) {
        if(super.informar() >= monto){
            super.extraer(monto);
            System.out.println("su nuevo saldo es de: " + super.informar());
        }else {
            System.out.println("No podes realizar esta transaccion");
        }
    }

    public void cobrarInteres(){
        super.depositar(super.informar() * this.interes);
    }
}
