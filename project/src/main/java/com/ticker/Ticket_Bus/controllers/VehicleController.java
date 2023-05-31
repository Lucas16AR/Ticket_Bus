package main.java.com.ticker.Ticket_Bus.controllers;

import com.ticker.Ticket_Bus.models.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return (List<Vehicle>) vehicleRepository.findAll();
    }

    @PostMapping
    public void addVehicle(@RequestBody Vehicle vehicle) {
        userRepository.save(vehicle);
    }
    @PutMapping
    public void updateVehicle(@RequestBody Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }
    @DeleteMapping(value="/deleteVehicle/{id}")
    public ResponseEntity<String> deleteVehicle(@PathVariable("id") Long id) {
        vehicleRepository.deleteById(id);
        return ResponseEntity.ok("Vehicle deleted successfully");
    }
}