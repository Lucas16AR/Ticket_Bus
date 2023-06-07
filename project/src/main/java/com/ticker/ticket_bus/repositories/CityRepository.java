package com.ticker.ticket_bus.repositories;
import com.ticker.ticket_bus.models.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long> {
}