package main.java.com.ticker.Ticket_Bus.services;
import main.java.com.ticker.Ticket_Bus.repositories.CityRepository;
import main.java.com.ticker.Ticket_Bus.models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.stereotype.Service;
import java.util.List;

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

    public List<City> getAllCities() {
        return cityRepository.findAll().orElse(null);
    }
}