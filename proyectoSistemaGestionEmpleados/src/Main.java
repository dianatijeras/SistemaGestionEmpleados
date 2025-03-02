import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa0 = new Empresa("Empresa");
        int opcion;

        do {
            System.out.println("\n--- OPCIONES ---");
            System.out.println("1. Crear nuevo empleado");
            System.out.println("2. Crear nuevo gerente");
            System.out.println("3. Crear nuevo técnico");
            System.out.println("4. Crear nuevo departamento");
            System.out.println("5. Crear nuevo proyecto");
            System.out.println("6. Asignar empleado a departamento");
            System.out.println("7. Asignar empleado a proyecto");
            System.out.println("8. Mostrar lista de empleados");
            System.out.println("9. Mostrar lista de departamentos");
            System.out.println("10. Mostrar lista de proyectos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    empresa0.crearNunevoEmpleado();
                    break;
                case 2:
                    empresa0.crearNuevoGerente();
                    break;
                case 3:
                    empresa0.crearNuevoTecnico();
                    break;
                case 4:
                    empresa0.crearNuevoDepartamento();
                    break;
                case 5:
                    empresa0.crearNuevoProyecto();
                    break;
                case 6:
                    empresa0.asignarEmpleadoADepartamento();
                    break;
                case 7:
                    empresa0.asignarEmpleadoAProyecto();
                    break;
                case 8:
                    System.out.println(empresa0.getListaEmpleados());
                    break;
                case 9:
                    System.out.println(empresa0.getListaDepartamentos());
                    break;
                case 10:
                    System.out.println(empresa0.getListaProyectos());
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}