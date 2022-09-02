public class Cine {
    private  String nombre;
    private  String direccion;
    private Integer cantEspectadores;
    private Pelicula pelicula;

    public Cine(String nombre, String direccion, Integer cantEspectadores, Pelicula pelicula) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantEspectadores = cantEspectadores;
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
