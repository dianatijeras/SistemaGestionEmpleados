import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class Gerente extends Empleado implements IContribuyente {
    private String telefono;
    private Collection<Proyecto> listaProyectos;

    /**
     * Constructor de la clase Gerente
     * @param nombre
     * @param id
     * @param departamento
     * @param telefono
     */
    public Gerente(String nombre, String id, Departamento departamento, String telefono) {
        super(nombre, id, departamento);
        this.telefono = telefono;
        this.listaProyectos = new LinkedList<>();
    }

    /**
     * Metodo que obtiene el telefono de un gerente
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo que establece el telefono de un gerente
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo que obtiene la lista de proyectos que gestional el gerente
     * @return
     */
    public Collection<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    /**
     * Metodo que establece la lista de proyectos que gestiona el gerente
     * @param listaProyectos
     */
    public void setListaProyectos(Collection<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    /**
     * Metodo que implementa la clase gerente
     */
    @Override
    public void contribuir() {
        System.out.println(getNombre()+ "contribuyó" );
    }


    /**
     * Metodo toString de la clase
     * @return
     */
    @Override
    public String toString() {
        return "Gerente: Nombre= "+ getNombre() +
                ", Id= " + getId() + ", Departamento= " + getDepartamento() +
                ", telefono= '" + telefono + '\'' +
                ", listaProyectos= " + listaProyectos;
    }

}
