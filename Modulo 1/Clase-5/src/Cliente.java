public class Cliente {
    //  Atributos
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;
    //CONSTRUCTOR

    public Cliente(String nombre, Integer numeroCliente ){
        this.numeroCliente = numeroCliente;
        this.nombre=nombre;
        deuda= 0.0;
    }
    
    // responsabilidades

    public void incrementoDueda(Double monto){
        deuda +=monto;
        System.out.println(nombre + numeroCliente);
        System.out.println(deuda);
    }

    // set y get


    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }
}

