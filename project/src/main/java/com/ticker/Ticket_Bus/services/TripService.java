package main.java.com.ticker.Ticket_Bus.services;
import main.java.com.ticker.Ticket_Bus.repositories.TripRepository;
import main.java.com.ticker.Ticket_Bus.models.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.stereotype.Service;
import java.util.List;

@Service
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

    public List<Trip> getAllTrips() {
        return tripRepository.findAll().orElse(null);
    }
}