package one.digital.innovation.gof.singleton;
/**
 *Singleton "Lazy Holder"
 *
 * @author lorenzo-danesi 
 */
public class SingletonLazyHolder {

    //cria uma classe interna para encapsular a instância
    private static class InstanceHolder {
        public static SingletonLazyHolder intancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }
    
    public static SingletonLazyHolder getInstancia(){
        //retorna acessando a classe detentora da instância
        return InstanceHolder.intancia;
    }
}
