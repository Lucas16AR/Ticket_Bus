package com.ticker.ticket_bus.services;
import com.ticker.ticket_bus.repositories.CityRepository;
import com.ticker.ticket_bus.models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public City addCity(City city) {
        return cityRepository.save(city);
    }

    public City updateCity(City city) {
        return cityRepository.save(city);
    }

    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

    public City getCity(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    Iterable<City> cityIterable = cityRepository.findAll();
    public CityService(Iterable<City> cityIterable) {
        this.cityIterable = cityIterable;
    }
}