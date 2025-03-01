public class Empleado {
    private String nombre;
    private String id;
    private Departamento departamento;

    /**
     * Constructor de la clase Empleado
     * @param nombre
     * @param id
     * @param departamento
     */
    public Empleado(String nombre, String id, Departamento departamento){
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    }

    /**
     * Metodo que obtiene el nombre de un empleado
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de un empleado
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el ID de un empleado
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Metodo que establece el ID de un empleado
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Metodo que obtiene el departamento del empleado
     * @return
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Metodo que establece el departamento del empleado
     * @param departamento
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre= '" + nombre + '\'' +
                ", id= '" + id + '\'' +
                ", departamento=" + departamento.getNombre() +
                '}';
    }
}
