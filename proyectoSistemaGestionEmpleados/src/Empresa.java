import java.util.Collection;
import java.util.LinkedList;

public class Empresa {

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
    }

    /**
     * Metodo que obtiene el nombre de una empresa
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de una empresa
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Collection<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(Collection<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public Collection<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(Collection<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }
}
