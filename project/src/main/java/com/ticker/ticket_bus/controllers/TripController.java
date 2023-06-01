package com.ticker.ticket_bus.controllers;

import com.ticker.ticket_bus.models.Trip;
import com.ticker.ticket_bus.repositories.TripRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {
    @Autowired
    private TripRepository tripRepository;

    @GetMapping
    public List<Trip> getAllTrips() {
        return (List<Trip>) tripRepository.findAll();
    }

    @PostMapping
    public void addTrip(@RequestBody Trip trip) {
        tripRepository.save(trip);
    }
    @PutMapping
    public void updateTrip(@RequestBody Trip trip) {
        tripRepository.save(trip);
    }
    @DeleteMapping(value="/deleteTrip/{id}")
    public ResponseEntity<String> deleteTrip(@PathVariable("id") Long id) {
        tripRepository.deleteById(id);
        return ResponseEntity.ok("Trip deleted successfully");
    }
}
   
