
package Interface;

import Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer>{
    
}
