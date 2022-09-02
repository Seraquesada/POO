public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(313123, "Serafin", "44324913", "2344343435");

        CuentaCorriente cuenta = new CuentaCorriente(100.0, cliente, 50.00);

        cuenta.extraer(110.0);
        System.out.println(cuenta.informar());

    }
}