package com.ticker.ticket_bus.repositories;
import org.springframework.data.repository.CrudRepository;

import com.ticker.ticket_bus.models.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {
}