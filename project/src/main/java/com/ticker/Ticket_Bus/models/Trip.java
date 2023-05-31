package main.java.com.ticker.Ticket_Bus.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Time;
import java.util.List;
import java.io.Serializable;

import main.java.com.ticker.Ticket_Bus.models.City;
import main.java.com.ticker.Ticket_Bus.models.Vehicle;
import main.java.com.ticker.Ticket_Bus.models.Company;
import main.java.com.ticker.Ticket_Bus.models.Booking;

@Entity
@Table(name = "trips")
public class Trip implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "origin_city_id")
    private City originCity;

    @ManyToOne
    @JoinColumn(name = "destination_city_id")
    private City destinationCity;

    @Column(name = "trip_time")
    private Time tripTime;

    @Column(name = "distance")
    private int distance;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(mappedBy = "trip")
    private List<Booking> bookings;

    public Trip() {
    }

    // Getters and Setters...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public City getOriginCity() {
        return originCity;
    }

    public void setOriginCity(City originCity) {
        this.originCity = originCity;
    }

    public City getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(City destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Time getTripTime() {
        return tripTime;
    }

    public void setTripTime(Time tripTime) {
        this.tripTime = tripTime;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}