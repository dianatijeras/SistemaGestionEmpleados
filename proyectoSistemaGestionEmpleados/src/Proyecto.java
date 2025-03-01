import java.util.Collection;
import java.util.LinkedList;

public class Proyecto {

    private String nombre;
    private String codigo;
    Collection<Empleado> listaEmpleados;

    /**
     * Constructor de la clase Proyecto
     * @param nombre
     * @param codigo
     */
    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEmpleados = new LinkedList<>();
    }

    /**
     * Metodo que obtiene el nombre de un proyecto
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de un proyecto
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el codigo de un proyecto
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo que establece el codigo de un proyecto
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo que obtiene la lista de empleados de un proyecto
     * @return
     */
    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Metodo que establece la lista de empleados de un proyecto
     * @param listaEmpleados
     */
    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
}
