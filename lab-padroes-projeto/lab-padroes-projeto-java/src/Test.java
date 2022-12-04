import one.digital.innovation.gof.facade.Facade;
import one.digital.innovation.gof.singleton.SingletonEager;
import one.digital.innovation.gof.singleton.SingletonLazy;
import one.digital.innovation.gof.singleton.SingletonLazyHolder;
import one.digital.innovation.gof.strategy.Comportamento;
import one.digital.innovation.gof.strategy.ComportamentoAgressivo;
import one.digital.innovation.gof.strategy.ComportamentoDefensivo;
import one.digital.innovation.gof.strategy.ComportamentoNormal;
import one.digital.innovation.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) throws Exception {

        //Testes relacionados ao Design Pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        //é necessário acessar pela classe, pois é private
        System.out.println(lazy);
        //retorna o endereço de memória
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Testes relacionados ao Design Pattern Strategy:

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        //diferentes implementações a partir de uma interface Comportamento (polimorfismo)
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Testes relacionados ao Design Pattern Facade:

        Facade facade = new Facade();
        facade.migrarCliente("Lorenzo", "12345-678");
    }
}
