public class Socio{

    private String nombre;
    private String numeroDeSocio;
    private Double cuotaMensual;
    private String actividad;


    public Socio(String nombre, String numeroDeSocio, Double cuotaMensual, String actividad) {
        this.nombre = nombre;
        this.numeroDeSocio = numeroDeSocio;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public Double calcularCostoMensual(){
        return cuotaMensual;
    }


}
