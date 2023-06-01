package com.ticker.ticket_bus.services;
import com.ticker.ticket_bus.repositories.VehicleRepository;
import com.ticker.ticket_bus.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.stereotype.Service;
// import java.util.List;
// 
// @Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

    public Vehicle getVehicle(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    // public List<Vehicle> getAllVehicles() {
        // return vehicleRepository.findAll();
    // }
}