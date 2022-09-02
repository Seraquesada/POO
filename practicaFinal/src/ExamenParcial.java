public class ExamenParcial extends Examen  implements  SumarNota{
    private final Integer numUnidadTomada;
    public ExamenParcial(Alumno alumno, String tituloTemaExamen, String enunciado, Integer notaPractico, Integer numUnidadTomada) {
        super(alumno, tituloTemaExamen, enunciado, notaPractico);
        this.numUnidadTomada = numUnidadTomada;
    }
    public void aprobado(){
        if (super.getNotaPractico() >= 4){
            System.out.println("El alumno " + super.getAlumno().getNombre()  + " aprobo con la nota " + super.getNotaPractico() );
        }else{ System.out.println("El alumno " + super.getAlumno().getNombre() + " desaprobo con la nota " + super.getNotaPractico()  );
    }}
    public void recursar(Integer numDeVecesRecursada ){
            if (numDeVecesRecursada < 4 && this.numUnidadTomada < 4){
                System.out.println("Puedes volver a recursar ");}
            else if (this.numUnidadTomada >= 4 && numDeVecesRecursada > 2  ) {
                System.out.println("Puedes volver a recursar ");
            } else{
                System.out.println("Lo siente no puedes recursar");
            }
    }
    @Override
    public int sumar() {
        return 0;
    }
    @Override
    public int sumar(int nota) {
        return 0;
    }
}
