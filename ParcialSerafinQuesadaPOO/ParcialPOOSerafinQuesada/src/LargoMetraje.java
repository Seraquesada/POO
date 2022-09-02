public class LargoMetraje extends  Pelicula  {

    private String tema;
    private  Integer cantActoresPrincipales;

    public LargoMetraje(String nombre, String clasificacion, String cantMinutos, String fechaEstreno, String nombreDirector, String tema, Integer cantActoresPrincipales) {
        super(nombre, clasificacion, cantMinutos, fechaEstreno, nombreDirector);
        this.tema = tema;
        this.cantActoresPrincipales = cantActoresPrincipales;
    }

    public Integer getCantActoresPrincipales() {
        return cantActoresPrincipales;
    }

    public void setCantActoresPrincipales(Integer cantActoresPrincipales) {
        this.cantActoresPrincipales = cantActoresPrincipales;
    }

    @Override
    public boolean equals(Object o) {
        return this.cantActoresPrincipales > ((LargoMetraje)o).getCantActoresPrincipales();
    }
}
