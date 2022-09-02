
public class SocioHabilitado extends Socio{

    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioHabilitado(String nombre, String numeroDeSocio, Double cuotaMensual, String actividad, Double costoPileta, Boolean estaHabilitado) {
        super(nombre, numeroDeSocio, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }

    @Override
    public Double calcularCostoMensual(){
        if(estaHabilitado){
            return  super.calcularCostoMensual() + costoPileta;
        }else{
            return super.calcularCostoMensual();
        }
    }

    public void nadar(){

    }
}
