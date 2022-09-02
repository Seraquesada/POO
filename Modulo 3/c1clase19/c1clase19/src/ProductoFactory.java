public class ProductoFactory {

    private static ProductoFactory instance;

    private ProductoFactory(){
    }
    public static ProductoFactory getInstance() {
        if (instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto crearProducto(String codigo){
        switch (codigo){
            case "CAJA10X10" :
                return new Caja(2.0,10.0,10.0,10.0);
            case "PELOTATENNIS" :
                return new Pelota(1.0,0.32);
            case "PELOTAFUTBOL" :
                return new Pelota(3.0,11.0);
        }
        return null;
    }
}
