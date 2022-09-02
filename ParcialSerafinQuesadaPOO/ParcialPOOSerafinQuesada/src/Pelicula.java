public abstract class Pelicula {
     private String nombre;
     private String clasificacion ;
     private String cantMinutos;
     private String fechaEstreno;
     private String nombreDirector;

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
     public Pelicula(String nombre, String clasificacion, String cantMinutos, String fechaEstreno, String nombreDirector) {
          this.nombre = nombre;
          this.clasificacion = clasificacion;
          this.cantMinutos = cantMinutos;
          this.fechaEstreno = fechaEstreno;
          this.nombreDirector = nombreDirector;
     }
     public String apt(){
          if (this.clasificacion == "APT"){
               return "La pelicula " + this.nombre + " es " + this.clasificacion;
          } else if (this.clasificacion == "Menor 13") {
               return "La pelicula " + this.nombre + " es apta para " + this.clasificacion;
          }   else {
              return  "la pelicula " + this.nombre + " es apta para " + this.clasificacion;
          }
     }

}
