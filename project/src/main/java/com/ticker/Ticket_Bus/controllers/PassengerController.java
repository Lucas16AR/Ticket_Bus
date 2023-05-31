package main.java.com.ticker.Ticket_Bus.controllers;

import com.ticker.Ticket_Bus.repositories.Passenger;
import com.ticker.Ticket_Bus.models.Passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    private PassengerRepository passengerRepository;

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return (List<Passenger>) houseRepository.findAll();
    }

    @PostMapping
    public void addPassenger(@RequestBody Passenger passenger) {
        passengerRepository.save(passenger);
    }
    @PutMapping
    public void updateHouse(@RequestBody Passenger passenger) {
        passengerRepository.save(passenger);
    }
    @DeleteMapping(value="/deletePassenger/{id}")
    public ResponseEntity<String> deletePassenger(@PathVariable("id") Long id) {
        passengerRepository.deleteById(id);
        return ResponseEntity.ok("Passenger deleted successfully");
    }
}