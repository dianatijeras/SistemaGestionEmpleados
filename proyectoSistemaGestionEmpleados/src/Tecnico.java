public class Tecnico extends Empleado implements IContribuyente{

    public Tecnico(String nombre, String id, Departamento departamento) {
        super(nombre, id, departamento);
    }

    /**
     * Metodo que implementa la clase Tecnico
     */
    @Override
    public void contribuir() {

    }
}
