public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new LargoMetraje
                ("Memento","Menor 18",
                        "130","2008",
                        "Nolan","Drama ", 1);

        Pelicula pelicula2 = new LargoMetraje(
                "Inception","APT",
                    "200","2010",
                    "Nolan","Drama",2);

        if (pelicula.equals(pelicula2)){
            System.out.println("La pelicula " + pelicula.getNombre() + " tiene mas actores principales");
        }   else {
            System.out.println("La pelicula " + pelicula2.getNombre() + " tiene mas actores principales");
        }
        System.out.println(pelicula.apt());
        System.out.println(pelicula2.apt());

        Cine cine = new Cine("Cinemark","Santa fe",150,pelicula);
        System.out.println(cine.getNombre());

        CortoMetraje corto= new CortoMetraje("UP","Animacion",
                "25","2004","Walt","Extranjero");
        if (corto.esNacional()){
            System.out.println("El corto es nacional");
        }
        System.out.println("El corto es extranjero");
    }
}