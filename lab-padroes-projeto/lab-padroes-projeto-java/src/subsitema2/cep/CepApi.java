package subsitema2.cep;

public class CepApi {
    //utilização de um padrão Singleton para instanciar
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Araraquara";
    }

    public String recuperarEstado(String estado){
        return "SP";
    }

}