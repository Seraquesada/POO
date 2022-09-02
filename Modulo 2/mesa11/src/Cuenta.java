public abstract class Cuenta {

    private Double saldo;
    private Cliente cliente;

    public Cuenta(Double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public void depositar(Double monto){
        this.saldo += monto;
    }
    public abstract void extraer(Double monto);

    public Double informar(){
        return this.saldo;
    }
}
