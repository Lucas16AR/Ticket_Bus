package com.ticker.ticket_bus.controllers;

import com.ticker.ticket_bus.models.Passenger;
import com.ticker.ticket_bus.repositories.PassengerRepository;

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
        return (List<Passenger>) passengerRepository.findAll();
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