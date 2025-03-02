import java.util.Collection;
import java.util.LinkedList;

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
     * @return
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
     * @return
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
     * @return
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
     * @return
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


    public void asignarProyectoAGerente(Gerente gerente, Proyecto proyecto){
        if(!gerente.getListaProyectos().contains(proyecto)){
            gerente.getListaProyectos().add(proyecto);
            proyecto.agregarEmpleado(gerente);
        } else {
            System.out.println("El gerente ya esta asignado a este proyecto");
        }
    }
}
