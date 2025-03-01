public class Main {
    public static void main(String[] args) {


        //Nada
        Empresa empresa0 = new Empresa("Empresa");

        empresa0.crearNunevoEmpleado();
        empresa0.crearNuevoGerente();
        empresa0.crearNuevoTecnico();
        empresa0.crearNuevoDepartamento();
        empresa0.crearNuevoProyecto();

        empresa0.asignarEmpleadoADepartamento();
        empresa0.asignarEmpleadoAProyecto();

        System.out.println(empresa0.getListaEmpleados());
        System.out.println(empresa0.getListaDepartamentos());
        System.out.println(empresa0.getListaProyectos());

    }
}
