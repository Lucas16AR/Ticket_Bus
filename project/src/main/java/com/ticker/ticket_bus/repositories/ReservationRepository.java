package com.ticker.ticket_bus.repositories;
import com.ticker.ticket_bus.models.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}