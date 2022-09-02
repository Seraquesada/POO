public class ExamenFinal extends  Examen{
    private Integer notaOral;
    private String temaOral;

    public ExamenFinal(Alumno alumno, String tituloTemaExamen, String enunciado, Integer notaPractico, Integer notaOral, String temaOral) {
        super(alumno, tituloTemaExamen, enunciado, notaPractico);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }
    @Override
    public void  aprobado(){
        Integer promedio =  (this.notaOral + super.getNotaPractico())/2;
        if( promedio >= 4 ){
            System.out.println("El almuno aprobo");
        } else {  System.out.println("El almuno desaprobo");
    }}

    @Override
    public boolean equals(Object obj) {
        /*boolean sonIguales=false;
        Examen alumno2 = (Examen)obj;
        if (getNotaPractico() == alumno2.getNotaPractico()){
            sonIguales = true;
        }
        return sonIguales;*/
        return getNotaPractico() > ((ExamenFinal)obj).getNotaPractico() ;

    }


}
