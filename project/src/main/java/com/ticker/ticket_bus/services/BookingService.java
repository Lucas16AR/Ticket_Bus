package com.ticker.ticket_bus.services;
import com.ticker.ticket_bus.repositories.BookingRepository;
import com.ticker.ticket_bus.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.stereotype.Service;
// import java.util.List;
// 
// @Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking updateBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }

    public Booking getBooking(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    // public List<Booking> getAllBookings() {
        // return bookingRepository.findAll();
    // }
}