import java.util.ArrayList;
import java.util.List;

public class Combinada extends UnidadDeTrabajo{
    //atributos

    private Double coeficienteGlobal;

    private Double montoMaterial;

    private List<UnidadDeTrabajo> unidadesDeTrabajo;


    //constructor

    public Combinada(String nombre, String descripcion, Double coeficienteGlobal, Double montoMaterial) {
        super(nombre, descripcion);
        this.coeficienteGlobal = coeficienteGlobal;
        this.montoMaterial = montoMaterial;
        this.unidadesDeTrabajo = new ArrayList<>();
    }

    public void agregarUnidadDeTrabajo(UnidadDeTrabajo unidadDeTrabajo){
        unidadesDeTrabajo.add(unidadDeTrabajo);
    }


    @Override
    public Double calcularMonto() {
        Double montoTotal = 0.0;
        for (UnidadDeTrabajo unidadDeTrabajo : unidadesDeTrabajo) {
            montoTotal += unidadDeTrabajo.calcularMonto();
        }
        return montoTotal * coeficienteGlobal;
    }




}
