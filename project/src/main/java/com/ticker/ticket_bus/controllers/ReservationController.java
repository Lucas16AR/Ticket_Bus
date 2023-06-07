package com.ticker.ticket_bus.controllers;

import com.ticker.ticket_bus.models.Reservation;
import com.ticker.ticket_bus.repositories.ReservationRepository;
import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @PostMapping
    public void addReservation(@RequestBody Reservation reservation) {
        reservationRepository.save(reservation);
    }
    @PutMapping
    public void updateReservation(@RequestBody Reservation reservation) {
        reservationRepository.save(reservation);
    }
    @DeleteMapping(value="/deleteReservation/{id}")
    public ResponseEntity<String> deleteReservation(@PathVariable("id") Long id) {
        reservationRepository.deleteById(id);
        return ResponseEntity.ok("Reservation deleted successfully");
    }
}