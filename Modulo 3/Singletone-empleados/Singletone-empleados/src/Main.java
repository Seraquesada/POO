public class Main {
    public static void main(String[] args) {
        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        Empresa empresa = new Empresa("Marvel Entertainment Group, Inc");
        empresa.agregarEmpleado(empleadoFactory.crearEmpleado("EMP-RD"));
        empresa.agregarEmpleado(empleadoFactory.crearEmpleado("EMP-PH"));

        System.out.println(empresa.calcularSueldosTotal(30));

        //PRUEBO FUNCIONES EMPLEADOS
        EmpleadoContratado empleado = new EmpleadoContratado("Holis", "Ok", 5443, 100.0, 10.0 );
        System.out.println(empleado.calcularSueldo(1));
        //Neto = $100 x 8hs = $800
        //Retencion = Neto * 10/100 = $80
        //Bruto = Neto - Retencion = $720

        EmpleadoRelacionDependencia empleado2 = new EmpleadoRelacionDependencia("Soy", "Empleado", 4556, 3000.0);
        System.out.println(empleado2.calcularSueldo(10)); //1000
        System.out.println(empleado2.calcularSueldo(40)); //4000
    }
}