public abstract class UnidadDeTrabajo {
    //atributos
    private String nombre;

    private String descripcion;

    //constructor

    public UnidadDeTrabajo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    //metodos

    public abstract Double calcularMonto();


    @Override
    public String toString() {
        return "\n" + "-----------------------------------" + "\n" + "-----> " + "Nombre: " + nombre + " <-----" + "\n" + "-----> " + "Monto total: " +  "$" +calcularMonto() + " <-----" + "\n" + "-----------------------------------";
    }
}
