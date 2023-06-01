package com.ticker.ticket_bus.services;
import com.ticker.ticket_bus.repositories.PassengerRepository;
import com.ticker.ticket_bus.models.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.stereotype.Service;
// import java.util.List;
// 
// @Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    public Passenger updatePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    public void deletePassenger(Long id) {
        passengerRepository.deleteById(id);
    }

    public Passenger getPassenger(Long id) {
        return passengerRepository.findById(id).orElse(null);
    }

    // public List<Passenger> getAllPassengers() {
        // return passengerRepository.findAll();
    // }
}