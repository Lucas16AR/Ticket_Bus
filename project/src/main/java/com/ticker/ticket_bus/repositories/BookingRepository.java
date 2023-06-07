package com.ticker.ticket_bus.repositories;
import com.ticker.ticket_bus.models.Booking;
import org.springframework.data.repository.CrudRepository;


public interface BookingRepository extends CrudRepository<Booking, Long> {
}