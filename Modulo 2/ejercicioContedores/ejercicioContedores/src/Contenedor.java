public class Contenedor implements Comparable<Contenedor>{
    private String procedencia;
    private Integer identificador;
    private Boolean materialesPeligrosos;

    @Override
    public int compareTo(Contenedor o) {
        return this.identificador - o.identificador;
    }

    //constructor
    public Contenedor(String procedencia, Integer identificador, Boolean materialesPeligrosos) {
        this.procedencia = procedencia;
        this.identificador = identificador;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    //getters y setters
    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Boolean getMaterialesPeligrosos() {
        return materialesPeligrosos;
    }
awd
    public void setMaterialesPeligrosos(Boolean materialesPeligrosos) {
        this.materialesPeligrosos = materialesPeligrosos;
    }
}
