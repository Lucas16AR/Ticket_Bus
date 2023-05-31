package main.java.com.ticker.Ticket_Bus.controllers;

import com.ticker.Ticket_Bus.models.City;
import com.ticker.Ticket_Bus.repositories.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public List<City> getAllCities() {
        return (List<City>) cityRepository.findAll();
    }

    @PostMapping
    public void addCity(@RequestBody City city) {
        cityRepository.save(city);
    }
    @PutMapping
    public void updateCity(@RequestBody City city) {
        cityRepository.save(city);
    }
    @DeleteMapping(value="/deleteCity/{id}")
    public ResponseEntity<String> deleteCity(@PathVariable("id") Long id) {
        cityRepository.deleteById(id);
        return ResponseEntity.ok("City deleted successfully");
    }
}