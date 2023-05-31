package main.java.com.ticker.Ticket_Bus.controllers;
import com.ticker.Ticket_Bus.models.Reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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