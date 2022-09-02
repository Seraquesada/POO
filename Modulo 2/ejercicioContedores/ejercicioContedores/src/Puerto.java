import java.util.ArrayList;

public class Puerto {
    private ArrayList<Contenedor> contenedores;

    //constructor
    public Puerto() {
        this.contenedores = new ArrayList<Contenedor>();
    }

    public void agregarContenedor(Contenedor c){
        this.contenedores.add(c);
    }

    public void mostrarOrdenados(){
        contenedores.sort(null);

        for (Contenedor c: this.contenedores){
            System.out.println("Identificador: " + c.getIdentificador()); }
    }

    public Integer calcularPeligrosos(){
        Integer count = 0;

        for (Contenedor c: this.contenedores){
            if (c.getProcedencia().equals("desconocido")
                && c.getMaterialesPeligrosos()){
                count++;
            }
        }
        return count;
    }
}
