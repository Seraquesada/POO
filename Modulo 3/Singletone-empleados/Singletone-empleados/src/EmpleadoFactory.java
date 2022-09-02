public class EmpleadoFactory {
    private static EmpleadoFactory instance;

    //CONSTRUCTOR PRIVADO
    private EmpleadoFactory() {}

    //INSTANCE
    public static EmpleadoFactory getInstance() {
        if (instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    //FACTORY EMPLEADOS
    public Empleado crearEmpleado(String codigo){
        switch(codigo){
            case "EMP-RD":
                return new EmpleadoRelacionDependencia("Bruce", "Wayne", 34553, 1000.0);
            case "EMP-PH":
                return new EmpleadoContratado("Diana", "Prince", 25636, 7.0, 14.0);
            default:
                break;
        }
        return null;
    }
}
