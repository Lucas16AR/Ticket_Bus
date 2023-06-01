package com.ticker.ticket_bus.services;
import com.ticker.ticket_bus.repositories.BookingRepository;
import com.ticker.ticket_bus.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
    
    Iterable<Booking> bookingIterable = bookingRepository.findAll();
    public BookingService(Iterable<Booking> bookingIterable) {
        this.bookingIterable = bookingIterable;
    }
}