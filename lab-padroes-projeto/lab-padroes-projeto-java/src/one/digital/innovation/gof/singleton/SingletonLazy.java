package one.digital.innovation.gof.singleton;
/**
 *Singleton "preguiçoso"
 *
 * @author lorenzo-danesi 
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }
    
    public static SingletonLazy getInstancia(){
    //verificação se a instância é nula
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        //caso contrário retorna ela mesma
        return instancia;
    }
}
