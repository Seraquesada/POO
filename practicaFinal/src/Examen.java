
public abstract class Examen {
    private  Alumno alumno;
    private String tituloTemaExamen;
    private String enunciado;
    private Integer notaPractico;

    public Examen(Alumno alumno, String tituloTemaExamen, String enunciado, Integer notaPractico) {
        this.alumno = alumno;
        this.tituloTemaExamen = tituloTemaExamen;
        this.enunciado = enunciado;
        this.notaPractico = notaPractico;
    }


    public abstract void aprobado();

    public Alumno getAlumno() {
        return alumno;
    }


    public String getTituloTemaExamen() {
        return tituloTemaExamen;
    }

    public void setTituloTemaExamen(String tituloTemaExamen) {
        this.tituloTemaExamen = tituloTemaExamen;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Integer getNotaPractico() {
        return notaPractico;
    }
    public void setNotaPractico(Integer notaPractico) {
        this.notaPractico = notaPractico;
    }


}
