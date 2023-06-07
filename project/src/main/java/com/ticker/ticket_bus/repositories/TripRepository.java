package com.ticker.ticket_bus.repositories;
import com.ticker.ticket_bus.models.Trip;
import org.springframework.data.repository.CrudRepository;

public interface TripRepository extends CrudRepository<Trip, Long> {
}