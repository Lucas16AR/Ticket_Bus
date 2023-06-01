package com.ticker.ticket_bus.repositories;
import com.ticker.ticket_bus.models.Passenger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Long> {
}