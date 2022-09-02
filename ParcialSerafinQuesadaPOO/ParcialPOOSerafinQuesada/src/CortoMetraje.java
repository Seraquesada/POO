import java.util.Objects;

public class CortoMetraje extends Pelicula implements Comparable  {
    private String nacionalidad;

    public CortoMetraje(String nombre, String clasificacion, String cantMinutos, String fechaEstreno, String nombreDirector, String nacionalidad) {
        super(nombre, clasificacion, cantMinutos, fechaEstreno, nombreDirector);
        this.nacionalidad = nacionalidad;
    }

    public boolean esNacional(){
      if (Objects.equals(this.nacionalidad, "Nacional")){
          return true;
      } else {
          return false;
      }
    }

}
