import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{

    private List<Comprable> comprableList;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        comprableList = new ArrayList<>();
    }

    public void agregarComprable (Comprable comprable){
        comprableList.add(comprable);
    }

    @Override
    public Double informarPrecio() {
        Double sumaPrecio = 0.0;
        System.out.println("enconte un combo");
        for (Comprable comprable : comprableList) {
            sumaPrecio += comprable.informarPrecio();
        }
        Double precioFinal = sumaPrecio - sumaPrecio*descuento;
        System.out.println("el precio total es de " + sumaPrecio + " con el descuento te queda " + precioFinal);

        return precioFinal;
    }
}
