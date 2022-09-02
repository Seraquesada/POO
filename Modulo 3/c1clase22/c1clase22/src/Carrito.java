import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Comprable> comprableList;

    public Carrito() {
        comprableList = new ArrayList<>();
    }

    public void agregarACarrito (Comprable comprable){
        comprableList.add(comprable);
    }

    public Double informarPrecioTotal(){
        Double precioCarrito = 0.0;
        for (Comprable comprable : comprableList) {
            precioCarrito += comprable.informarPrecio();
        }
        return precioCarrito;
    }





}
