public class UnicaEmpresa {

    private static UnicaEmpresa instancia;

    private UnicaEmpresa(){
    }

    public static UnicaEmpresa getInstancia(){
        if(instancia == null){
            instancia = new UnicaEmpresa();
        }
        return instancia;
    }
}
