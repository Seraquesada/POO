import java.util.ArrayList;
import java.util.List;

public class Presupuesto {

    private List<UnidadDeTrabajo> unidadesDeTrabajo;


    public Presupuesto(){
        unidadesDeTrabajo = new ArrayList<>();
    }
    
    public void mostrarInfo(){
        for (UnidadDeTrabajo unidadDeTrabajo : unidadesDeTrabajo) {
            System.out.println(unidadDeTrabajo.toString());
        }
    }

    public void agregarUnidadDeTrabajo(String codigo){

        try {
            unidadesDeTrabajo.add(UnidadDeTrabajoFactory.getInstance().crearUnidadDeTrabajo(codigo));
        } catch (UnidadDeTrabajoException exception){
            System.out.println(exception.getMessage());
        };
    }

}
