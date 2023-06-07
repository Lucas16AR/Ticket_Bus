package com.ticker.ticket_bus.controllers;

import com.ticker.ticket_bus.models.Vehicle;
import com.ticker.ticket_bus.repositories.VehicleRepository;
import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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
        vehicleRepository.save(vehicle);
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