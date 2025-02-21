public class Tecnico extends Empleado implements IContribuyente{

    public Tecnico(String nombre, String id, Departamento departamento) {
        super(nombre, id, departamento);
    }

    @Override
    public void contribuir() {

    }
}
