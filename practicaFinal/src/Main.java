public class Main {
    public static void main(String[] args) {

     Alumno alumno1 = new Alumno("Serafin","Quesada","2334");
     ExamenParcial examenParcial = new ExamenParcial(alumno1,"Clases Abstractas","2",8,4);

     examenParcial.aprobado();
     examenParcial.recursar(2);

     Examen examenfinal= new ExamenFinal (alumno1,"Herencia","3",5,5,"Herencia");
     Examen alumno2 = new ExamenFinal(new Alumno("Mati","Avellana","234234"),"asd","asd",10,2,"asd");

     examenfinal.aprobado();

     if (examenfinal.equals(alumno2)){
         System.out.println("El alumno " + alumno1.getNombre() + " tiene mayor nota");
     } else {
         System.out.println("El  alumno " + alumno2.getAlumno().getNombre() + " tiene mejor nota ");
     }
    }
}