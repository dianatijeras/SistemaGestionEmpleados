import java.util.Collection;
import java.util.LinkedList;

public class Gerente extends Empleado implements IContribuyente {
    private String telefono;
    private Collection<Proyecto> listaProyectos;

    public Gerente(String nombre, String id, Departamento departamento, String telefono) {
        super(nombre, id, departamento);
        this.telefono = telefono;
        this.listaProyectos = new LinkedList<>();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Collection<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(Collection<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    @Override
    public void contribuir() {
        
    }
}
