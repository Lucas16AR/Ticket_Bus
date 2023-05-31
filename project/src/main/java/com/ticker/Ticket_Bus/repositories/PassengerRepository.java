package main.java.com.ticker.Ticket_Bus.repositories;
#importa modelos
#import ;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Long> {
}