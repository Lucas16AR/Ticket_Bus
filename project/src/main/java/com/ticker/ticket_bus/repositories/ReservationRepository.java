package com.ticker.ticket_bus.repositories;
import org.springframework.data.repository.CrudRepository;

import com.ticker.ticket_bus.models.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}