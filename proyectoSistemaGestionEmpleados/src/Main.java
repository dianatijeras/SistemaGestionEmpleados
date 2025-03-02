import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void mostrarEmpleadosPorDepartamento(Departamento departamento){
        Collection<Empleado> empleados = departamento.listarEmpleados();
        System.out.println("Empleados en el departamento " + departamento.getNombre() + ": ");
        for (Empleado empleado : listaEmpleados){
            System.out.println(empleado);
        }
    }
}