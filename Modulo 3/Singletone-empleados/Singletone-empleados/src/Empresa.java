import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleadoList;

    //CONSTRUCTOR EMPRESA
    public Empresa(String razonSocial) { //no tengo que ponerle el array acá (así al crear la empresa puedo no tener empleados)
        this.razonSocial = razonSocial;
        empleadoList = new ArrayList<Empleado>();
    }

    //CALCULO TOTAL SUELDOS de todos los empleados que fueron cargados (según x cantidad de días)
    public Double calcularSueldosTotal(int dias){
        Double totalSueldos = 0.0;
        for (Empleado empleado: empleadoList) { //por cada empleado de la lista empleados
            totalSueldos += empleado.calcularSueldo(dias); //calcular su sueldo y sumarlo a acumulador
        }
        return totalSueldos;
    }

    //AGREGAR EMPLEADOS A LISTA
    public void agregarEmpleado(Empleado empleado){
        empleadoList.add(empleado);
    }
}
