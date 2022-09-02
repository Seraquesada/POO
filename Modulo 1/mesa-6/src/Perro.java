public class Perro {

    private String raza;
    private Integer anoNacimiento;
    private Double peso;
    private String nombre;
    private Boolean estaLastimado;
    private Boolean tieneChip;


    public Perro(String raza, Integer anoNacimiento, Double peso, String nombre, Boolean estaLastimado, Boolean tieneChip) {
        this.raza = raza;
        this.anoNacimiento = anoNacimiento;
        this.peso = peso;
        this.nombre = nombre;
        this.estaLastimado = estaLastimado;
        this.tieneChip = tieneChip;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
