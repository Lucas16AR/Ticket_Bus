package com.ticker.ticket_bus.repositories;
import com.ticker.ticket_bus.models.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}