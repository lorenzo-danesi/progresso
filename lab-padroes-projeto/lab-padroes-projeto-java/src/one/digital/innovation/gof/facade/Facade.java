package one.digital.innovation.gof.facade;

import subsistema1.crm.CrmService;
import subsitema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        //usa o Singleton implementado na classe p/ recuperar os valores faltantes
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
