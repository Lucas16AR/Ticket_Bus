package com.ticker.ticket_bus.repositories;
import org.springframework.data.repository.CrudRepository;

import com.ticker.ticket_bus.models.City;

public interface CityRepository extends CrudRepository<City, Long> {
}