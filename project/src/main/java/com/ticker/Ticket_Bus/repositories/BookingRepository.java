package main.java.com.ticker.Ticket_Bus.repositories;
import main.java.com.ticker.Ticket_Bus.models.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long> {
}