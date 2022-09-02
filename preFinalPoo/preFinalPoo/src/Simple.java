public class Simple extends UnidadDeTrabajo{
    //atributos
    private Double montoPorPersona;
    private Integer cantPersonas;

    //constructor

    public Simple(String nombre, String descripcion, Double montoPorPersona, Integer cantPersonas) {
        super(nombre, descripcion);
        this.montoPorPersona = montoPorPersona;
        this.cantPersonas = cantPersonas;
    }

    //metodos

    @Override
    public Double calcularMonto() {
        if (this.cantPersonas > 10){
            return (montoPorPersona * cantPersonas * 20/100) + (montoPorPersona * cantPersonas);
        }
        return cantPersonas * montoPorPersona;
    }






}
