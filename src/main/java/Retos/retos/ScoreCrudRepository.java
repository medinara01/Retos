package Retos.retos;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface ScoreCrudRepository extends CrudRepository<Score, Integer>{

    public Optional<Score> findAllById(int id);
    
}
