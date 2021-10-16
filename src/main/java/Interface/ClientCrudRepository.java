
package Interface;

import Modelo.Client;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface ClientCrudRepository extends CrudRepository<Client, Integer>{

    public Optional<Client> findAllById(int id);
    
}
