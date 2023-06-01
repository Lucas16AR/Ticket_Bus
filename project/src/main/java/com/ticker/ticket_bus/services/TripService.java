package com.ticker.ticket_bus.services;
import com.ticker.ticket_bus.repositories.TripRepository;
import com.ticker.ticket_bus.models.Trip;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.stereotype.Service;
// import java.util.List;
// 
// @Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public Trip addTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    public Trip updateTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    public void deleteTrip(Long id) {
        tripRepository.deleteById(id);
    }

    public Trip getTrip(Long id) {
        return tripRepository.findById(id).orElse(null);
    }

    // public List<Trip> getAllTrips() {
        // return tripRepository.findAll();
    // }
}