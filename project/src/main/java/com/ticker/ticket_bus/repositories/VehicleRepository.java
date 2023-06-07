package com.ticker.ticket_bus.repositories;
import org.springframework.data.repository.CrudRepository;

import com.ticker.ticket_bus.models.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}