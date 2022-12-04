package one.digital.innovation.gof.singleton;
/**
 *Singleton "apressado"
 *
 * @author lorenzo-danesi 
 */
public class SingletonEager {

    //a istância já é feita, sem a necessidade da verificação
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }
    
    public static SingletonEager getInstancia(){
        //retorna o valor instanciado do início
        return instancia;
    }
}
