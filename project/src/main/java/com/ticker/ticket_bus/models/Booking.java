package com.ticker.ticket_bus.models;

import javax.persistence.*;
import java.util.List;
import java.io.Serializable;

@Entity
@Table(name = "bookings")
public class Booking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "origin_city_id")
    private City originCity;

    @ManyToOne
    @JoinColumn(name = "destination_city_id")
    private City destinationCity;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(mappedBy = "booking")
    private List<Reservation> reservations;

    @ManyToMany
    @JoinTable(name = "booking_passenger",
               joinColumns = @JoinColumn(name = "booking_id"),
               inverseJoinColumns = @JoinColumn(name = "passenger_id"))
    private List<Passenger> passengers;

    public Booking() {
        // Empty constructor required by JPA
    }

    public Booking(City originCity, City destinationCity, Company company) {
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        this.company = company;
    }

    // Getters and Setters...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}