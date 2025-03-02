public class UnicaEmpresa {

    private static UnicaEmpresa instancia;


    /**
     * Constructor privado de la clase UnicaEmpresa para evitar la creación de instancias fuera de esta clase
     */
    private UnicaEmpresa(){
    }


    /**
     * Método estático que devuelve la única instancia de la clase UnicaEmpresa
     * Si la instancia no existe, se crea
     * @return
     */
    public static UnicaEmpresa getInstancia(){
        if(instancia == null){
            instancia = new UnicaEmpresa();
        }
        return instancia;
    }


    //kadhsah
}
