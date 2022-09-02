import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> listaEmpleado;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.listaEmpleado =  new ArrayList<>();
    }
    public Double calcularSueldoTotal(){
        Double sueldosTotales = 0.0;
        for (Empleado empleado : listaEmpleado) {
            sueldosTotales += empleado.sueldoMensual().;

        }
        return sueldosTotales;
    }
}
