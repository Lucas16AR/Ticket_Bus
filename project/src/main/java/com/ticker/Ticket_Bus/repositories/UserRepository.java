package main.java.com.ticker.Ticket_Bus.repositories;
import main.java.com.ticker.Ticket_Bus.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}