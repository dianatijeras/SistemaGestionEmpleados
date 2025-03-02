import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class Empresa {

    private UnicaEmpresa unicaEmpresa;
    private String nombre;
    private Collection<Empleado> listaEmpleados;
    private Collection<Departamento> listaDepartamentos;
    private Collection<Proyecto> listaProyectos;

    /**
     * Constructor de la clase principal Empresa
     * @param nombre
     */
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new LinkedList<>();
        this.listaDepartamentos = new LinkedList<>();
        this.listaProyectos = new LinkedList<>();
        this.unicaEmpresa = UnicaEmpresa.getInstancia();
    }

    /**
     * Metodo que obtiene el nombre de la empresa
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de la empresa
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene la lista de empleados de la empresa
     * @return listaEmpleados
     */
    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Metodo que establece la lista de empleados de la empresa
     * @param listaEmpleados
     */
    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Metodo que obtiene la lista de departamentos de la empresa
     * @return listaDepartamentos
     */
    public Collection<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    /**
     * Metodo que establece la lista de departamentos de la empresa
     * @param listaDepartamentos
     */
    public void setListaDepartamentos(Collection<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    /**
     * Metodo que obtiene la lista de proyectos de la empresa
     * @return listaProyectos
     */
    public Collection<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    /**
     * Metodo que establece la lista de proyectos de la empresa
     * @param listaProyectos
     */
    public void setListaProyectos(Collection<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }


    /**
     * Metodo para crear un nuevo empleado
     */
    public void crearNunevoEmpleado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        String id;
        do {
            System.out.println("Ingrese la cédula del nuevo empleado: ");
            id = scanner.nextLine();
            if (verificarEmpleado(id)) {
                System.out.println("Ya existe un empleado con esa cédula. Por favor, ingrese una cédula diferente.");
            }
        } while (verificarEmpleado(id));

        Empleado empleado = new Empleado(nombre, id, null);

        agregarEmpleado(empleado);
    }


    /*
    Metodo para crear un nuevo empleado de tipo gerente
     */
    public void crearNuevoGerente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del gerente: ");
        String nombre = scanner.nextLine();

        String id;
        do {
            System.out.println("Ingrese la cédula del nuevo gerente: ");
            id = scanner.nextLine();

            if (verificarEmpleado(id)) {
                System.out.println("Ya existe un empleado con esa cédula. Por favor, ingrese una cédula diferente.");
            }
        } while (verificarEmpleado(id));

        System.out.println("Ingrese el telefono del gerente: ");
        String telefono = scanner.nextLine();

        Gerente gerente = new Gerente(nombre, id, null, telefono);

        agregarEmpleado(gerente);
    }

    /**
     * Metodo para crear un nuevo empleado de tipo tecnico
     */
    public void crearNuevoTecnico() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del tecnico: ");
        String nombre = scanner.nextLine();

        String id;
        do {
            System.out.println("id: ");
            id = scanner.nextLine();

            if (verificarEmpleado(id)) {
                System.out.println("Ya existe un empleado con esa cédula. Por favor, ingrese una cédula diferente.");
            }
        } while (verificarEmpleado(id));

        Tecnico tecnico = new Tecnico(nombre, id, null);

        agregarEmpleado(tecnico);
    }

    /**
     * Metodo para verificar si ya existe un empleado en la empresa con el mismo id
     * @param id
     * @return
     */
    public boolean verificarEmpleado(String id) {
        boolean centinela = false;
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getId().equals(id)) {
                return true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregar un nuevo empleado a la lista de empleados
     * @param empleado
     */
    public void agregarEmpleado(Empleado empleado) {
        if (!verificarEmpleado(empleado.getId())) {
            listaEmpleados.add(empleado);
        }
    }


    @Override
    public String toString() {
        return "Empresa{" +
                ", nombre='" + nombre + '\'' +
                "\n listaEmpleados=" + listaEmpleados +
                "\n listaDepartamentos=" + listaDepartamentos +
                "\n listaProyectos=" + listaProyectos +
                '}';
    }

    //CRUD departamento


    /**
     * Metodo para crear un nuevo departamento
     */
    public void crearNuevoDepartamento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del nuevo departamento: ");
        String nombre = scanner.nextLine();

        String codigo;
        do {
            System.out.println("Ingrese el codigo del nuevo departamento: ");
            codigo = scanner.nextLine();

            if (verificarDepartamento(codigo)) {
                System.out.println("Ya existe un departamento con ese codigo. Por favor, ingrese un codigo diferente.");
            }
        } while (verificarDepartamento(codigo));

        Departamento departamento = new Departamento(nombre, codigo);

        agregarDepartamento(departamento);
    }

    /**
     * Metodo que agrega un departamento a la lista de departamentos de la empresa
     * @param departamento
     */
    public void agregarDepartamento(Departamento departamento) {
        if (!verificarDepartamento(departamento.getCodigo())) {
            listaDepartamentos.add(departamento);
        }
    }

    /**
     * Metodo que verifica que no existan dos departamentos con el mismo id
     * @param codigo
     * @return centinela
     */
    public boolean verificarDepartamento(String codigo) {
        boolean centinela = false;
        for (Departamento departamento : listaDepartamentos) {
            if (departamento.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return centinela;
    }

    //CRUD Proyecto

    /**
     * Metodo para crear un nuevo proyecto
     */
    public void crearNuevoProyecto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del nuevo proyecto: ");
        String nombre = scanner.nextLine();

        String codigo;
        do {
            System.out.println("Ingrese el codigo del nuevo proyecto: ");
            codigo = scanner.nextLine();

            if (verificarProyectos(codigo)) {
                System.out.println("Ya existe un proyecto con ese codigo. Por favor, ingrese un codigo diferente.");
            }
        } while (verificarProyectos(codigo));

        Proyecto proyecto = new Proyecto(nombre, codigo);

        agregarProyecto(proyecto);
    }

    /**
     * Metodo para agregar un pryecto a la lista de proyectos de la empresa
     * @param proyecto
     */
    public void agregarProyecto(Proyecto proyecto) {
        if (!verificarProyectos(proyecto.getCodigo())) {
            listaProyectos.add(proyecto);
        }
    }

    /**
     * Metodo para verificar que no existan dos proyectos con el mismo codigo
     * @param codigo
     * @return centinela
     */
    public boolean verificarProyectos(String codigo) {
        boolean centinela = false;
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para asignar a un empleado a un departamento
     */
    public void asignarEmpleadoADepartamento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el ID o cédula del empleado: ");
        String id = scanner.nextLine();

        Empleado empleadoEncontrado = null;
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getId().equals(id)) {
                empleadoEncontrado = empleado;
                break;
            }
        }

        if (empleadoEncontrado == null) {
            System.out.println("Empleado no encontrado.");
            return;
        }

        System.out.println("Ingrese el código del departamento: ");
        String codigo = scanner.nextLine();

        Departamento departamentoEncontrado = null;
        for (Departamento departamento : listaDepartamentos) {
            if (departamento.getCodigo().equals(codigo)) {
                departamentoEncontrado = departamento;
                break;
            }
        }

        if (departamentoEncontrado == null) {
            System.out.println("Departamento no encontrado.");
            return;
        }

        departamentoEncontrado.agregarEmpleado(empleadoEncontrado);
        empleadoEncontrado.setDepartamento(departamentoEncontrado);

        System.out.println("Empleado asignado correctamente al departamento.");
    }



    /**
     * Metodo para asignar un empleado a un proyecto
     */
    public void asignarEmpleadoAProyecto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el id o cédula del empleado: ");
        String id = scanner.nextLine();

        for (Empleado empleado : listaEmpleados) {
            if (empleado.getId().equals(id)) {
                System.out.println("Ingrese el código del Proyecto: ");
                String codigo = scanner.nextLine();

                for (Proyecto proyecto : listaProyectos) {
                    if (proyecto.getCodigo().equals(codigo)) {
                        proyecto.agregarEmpleado(empleado);

                        // Si el empleado es un Gerente, se le asigna el proyecto a su lista de proyectos
                        if (empleado instanceof Gerente) {
                            Gerente gerente = (Gerente) empleado;
                            gerente.getListaProyectos().add(proyecto);
                        }

                        System.out.println("Empleado asignado correctamente al proyecto.");
                        return;
                    }
                }
                System.out.println("No se encontró un proyecto con ese código.");
                return;
            }
        }
        System.out.println("No se encontró un empleado con ese ID.");
    }
}