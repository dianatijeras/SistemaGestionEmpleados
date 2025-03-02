import java.util.Collection;
import java.util.LinkedList;

public class Departamento {

    private String nombre;
    private String codigo;
    private Collection<Empleado> listaEmpleados;

    /**
     * Constructor de la clase Departamento
     * @param nombre
     * @param codigo
     */
    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Metodo que obtiene el nombre de un departamento
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de un departamento
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el codigo de un departamento
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo que establece el codigo de un departamento
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo que obtiene la lista de empleados de un departamento
     * @return
     */
    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Metodo que establece la lista de empleados de un departamento
     * @param listaEmpleados
     */
    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Collection<Empleado> listarEmpleados(){
        return new LinkedList<>()(listaEmpleadosDepartamento);
    }
}
