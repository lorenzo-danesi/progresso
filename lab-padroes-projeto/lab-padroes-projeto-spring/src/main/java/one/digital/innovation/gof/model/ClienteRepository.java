package one.digital.innovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//interface que provê todos os métodos de acesso a dados
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
