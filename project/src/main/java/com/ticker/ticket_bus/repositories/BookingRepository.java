package com.ticker.ticket_bus.repositories;
import org.springframework.data.repository.CrudRepository;

import com.ticker.ticket_bus.models.Booking;

public interface BookingRepository extends CrudRepository<Booking, Long> {
}