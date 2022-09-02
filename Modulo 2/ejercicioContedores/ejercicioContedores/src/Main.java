public class Main {
    public static void main(String[] args) {

        Contenedor contenedor1 = new Contenedor("Bs As",10000,false);
        Contenedor contenedor2 = new Contenedor("Bs As",-1,true);
        Contenedor contenedor3 = new Contenedor("Bs As",0,true);

        Puerto puerto1 = new Puerto();

        puerto1.agregarContenedor(contenedor1);
        puerto1.agregarContenedor(contenedor2);
        puerto1.agregarContenedor(contenedor3);

        puerto1.mostrarOrdenados();
    }
}