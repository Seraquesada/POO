public class EmpleadoFactory {

    private static EmpleadoFactory instace;

    private EmpleadoFactory(){};

    public static EmpleadoFactory getInstace(){
        if (instace == null){
            instace = new EmpleadoFactory();
        }
        return instace;
    }

    public Empleado crearEmpleado(String codigo){
        switch (codigo){
            case "EMP-RD":
            return new EmpleadoRelacionDependencia("pato","alloco",1000,1000.0);
            case "EMP_PH":
                return new EmpleadoContratado("Serafin","quesada",123,7.0,0.14);
        }return null;
    }
}
