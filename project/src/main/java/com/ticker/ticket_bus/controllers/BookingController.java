package com.ticker.ticket_bus.controllers;

import com.ticker.ticket_bus.models.Booking;
import com.ticker.ticket_bus.repositories.BookingRepository;
import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping
    public List<Booking> getAllBookings() {
        return (List<Booking>) bookingRepository.findAll();
    }

    @PostMapping
    public void addBooking(@RequestBody Booking booking) {
        bookingRepository.save(booking);
    }
    @PutMapping
    public void updateBooking(@RequestBody Booking booking) {
        bookingRepository.save(booking);
    }
    @DeleteMapping(value="/deleteBooking/{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable("id") Long id) {
        bookingRepository.deleteById(id);
        return ResponseEntity.ok("Booking deleted successfully");
    }
}