package com.ticker.ticket_bus.repositories;
import com.ticker.ticket_bus.models.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {
}