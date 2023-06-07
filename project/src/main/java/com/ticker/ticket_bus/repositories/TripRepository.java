package com.ticker.ticket_bus.repositories;
import org.springframework.data.repository.CrudRepository;

import com.ticker.ticket_bus.models.Trip;

public interface TripRepository extends CrudRepository<Trip, Long> {
}