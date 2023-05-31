package main.java.com.ticker.Ticket_Bus.repositories;
import main.java.com.ticker.Ticket_Bus.models.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
}