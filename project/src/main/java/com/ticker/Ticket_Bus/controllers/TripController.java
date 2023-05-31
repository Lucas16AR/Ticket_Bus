package main.java.com.ticker.Ticket_Bus.controllers;
import com.ticker.Ticket_Bus.models.Trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {
    @Autowired
    private Repository tripRepository;


    @GetMapping
    public List<Trip> getAllTrips() {
        return (List<Trip>) TripRepository.findAll();
    }

    @PostMapping
    public void addTrip(@RequestBody Trip trip) {
        TripRepository.save(trip);
    }
    @PutMapping
    public void updateTrip(@RequestBody Trip trip) {
        TripRepository.save(trip);
    }
    @DeleteMapping(value="/deleteTrip/{id}")
    public ResponseEntity<String> deleteTrip(@PathVariable("id") Long id) {
        TripRepository.deleteById(id);
        return ResponseEntity.ok("Trip deleted successfully");
    }
}
   
