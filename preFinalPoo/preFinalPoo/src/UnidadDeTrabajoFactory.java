public class UnidadDeTrabajoFactory {
    //atributos
    public static final String LIMPIEZA = "Limpieza";
    public static final String MANTENIMIENTO = "Mantenimiento";
    public static final String COMBINADO = "Combinado";
    public static final String COMBINADOSUPERHYPERMEGANAZI = "Combinashe";
    public static final String COMBINADOSUPERHYPERMEGANAZIULTRAMEGADOU = "Combinasheardo";
    private static UnidadDeTrabajoFactory instance;
    //constructor
    private UnidadDeTrabajoFactory(){};
    //metodos

    public static UnidadDeTrabajoFactory getInstance() {
        if(instance == null){
            instance = new UnidadDeTrabajoFactory();
        }
        return instance;
    }

    public UnidadDeTrabajo crearUnidadDeTrabajo(String codigo) throws UnidadDeTrabajoException {
        switch (codigo) {
            case MANTENIMIENTO:
                return new Simple("Mantenimiento", "WTF re mujer", 120000.0, 4);
            case LIMPIEZA:
                return new Simple("Limpieza", "anashe", 100000.0, 24);
            case COMBINADO:
                Combinada combinada = new Combinada("Servicios Generales", "QSY", 3.0, 1.0);
                combinada.agregarUnidadDeTrabajo(crearUnidadDeTrabajo("Mantenimiento"));
                combinada.agregarUnidadDeTrabajo(crearUnidadDeTrabajo("Limpieza"));
                return combinada;
            case COMBINADOSUPERHYPERMEGANAZI:
                Combinada combinashe = new Combinada("Combinashe", "nashee", 3.0, 1.0);
                combinashe.agregarUnidadDeTrabajo(crearUnidadDeTrabajo(COMBINADO));
                combinashe.agregarUnidadDeTrabajo(crearUnidadDeTrabajo(COMBINADO));
                return combinashe;
            case COMBINADOSUPERHYPERMEGANAZIULTRAMEGADOU:
                Combinada combinasheardo = new Combinada("Combinasheardo", "nashee", 2.0, 1.0);
                combinasheardo.agregarUnidadDeTrabajo(crearUnidadDeTrabajo(COMBINADOSUPERHYPERMEGANAZI));
                combinasheardo.agregarUnidadDeTrabajo(crearUnidadDeTrabajo(COMBINADOSUPERHYPERMEGANAZI));
                return combinasheardo;
        }
        throw new UnidadDeTrabajoException("Flaco eso no existe");
    }
}
