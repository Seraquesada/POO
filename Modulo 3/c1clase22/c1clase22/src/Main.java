public class Main {
    public static void main(String[] args) {

        Producto hamburguesa = new Producto("Hamburguesa",2.80);
        Producto gaseosa = new Producto("Gaseaosa", 0.50);
        Producto papaFritas = new Producto("PapasFritas", 1.20);
        Producto helado = new Producto("Helado", 1.0);

        Combo combo1 = new Combo(0.10);
        combo1.agregarComprable(hamburguesa);
        combo1.agregarComprable(gaseosa);
        combo1.agregarComprable(papaFritas);

        Combo combo2 = new Combo(0.20);
        combo2.agregarComprable(combo1);
        combo2.agregarComprable(combo1);

        Combo combo3 = new Combo(0.25);
        combo3.agregarComprable(combo1);
        combo3.agregarComprable(combo2);
        combo3.agregarComprable(helado);
        combo3.agregarComprable(helado);
        combo3.agregarComprable(helado);

        Carrito carrito = new Carrito();
        carrito.agregarACarrito(combo1);
        carrito.agregarACarrito(combo2);
        carrito.agregarACarrito(combo3);

        carrito.informarPrecioTotal();


    }
}