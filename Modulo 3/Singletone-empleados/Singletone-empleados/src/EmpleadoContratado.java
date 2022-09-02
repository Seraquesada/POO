public class EmpleadoContratado extends Empleado {
    private Double importePorHora;
    private Double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, int legajo, Double importePorHora, Double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public Double calcularSueldo(int dias) {
       Double sueldoBruto = importePorHora*8*dias;
       Double retencion = sueldoBruto * retencionImpuesto/100;
       Double sueldoNeto = sueldoBruto - retencion;
       return sueldoNeto;
    }
}

