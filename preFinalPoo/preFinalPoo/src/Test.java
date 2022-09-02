public class Test {
    public static void main(String[] args) {

        Presupuesto presupuestoSegu = new Presupuesto();

        presupuestoSegu.agregarUnidadDeTrabajo(UnidadDeTrabajoFactory.MANTENIMIENTO);
        presupuestoSegu.agregarUnidadDeTrabajo(UnidadDeTrabajoFactory.LIMPIEZA);
        presupuestoSegu.agregarUnidadDeTrabajo(UnidadDeTrabajoFactory.COMBINADO);
        presupuestoSegu.agregarUnidadDeTrabajo(UnidadDeTrabajoFactory.COMBINADOSUPERHYPERMEGANAZI);
        presupuestoSegu.agregarUnidadDeTrabajo(UnidadDeTrabajoFactory.COMBINADOSUPERHYPERMEGANAZIULTRAMEGADOU);


        presupuestoSegu.mostrarInfo();



    }
}
