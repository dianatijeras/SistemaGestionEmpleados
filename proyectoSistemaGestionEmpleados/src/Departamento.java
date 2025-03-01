import java.util.Collection;
import java.util.LinkedList;

public class Departamento {

    private String nombre;
    private String codigo;
    private Collection<Empleado> listaEmpleadosDepartamento;

    /**
     * Constructor de la clase Departamento
     * @param nombre
     * @param codigo
     */
    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEmpleadosDepartamento = new LinkedList<>();
    }

    /**
     * Metodo que obtiene el nombre de un departamento
     * @return nombre
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
        return listaEmpleadosDepartamento;
    }

    /**
     * Metodo que establece la lista de empleados de un departamento
     * @param listaEmpleadosDepartamento
     */
    public void setListaEmpleadosDepartamento(Collection<Empleado> listaEmpleadosDepartamento) {
        this.listaEmpleadosDepartamento = listaEmpleadosDepartamento;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", listaEmpleados=" + listaEmpleadosDepartamento +
                '}';
    }


    /**
     * Metodo para verificar si ya existe un empleado en el departamento
     * @param id
     * @return
     */
    public boolean verificarEmpleado(String id) {
        boolean centinela = false;
        for (Empleado empleado : listaEmpleadosDepartamento) {
            if (empleado.getId().equals(id)) {
                return true;
            }
        }
        return centinela;
    }



    /**
     * Metodo para agregar un nuevo empleado a la lista de empleado
     * @param empleado
     */
    public void agregarEmpleado(Empleado empleado) {
        if (!verificarEmpleado(empleado.getId())) {
            listaEmpleadosDepartamento.add(empleado);
        }
    }
}
