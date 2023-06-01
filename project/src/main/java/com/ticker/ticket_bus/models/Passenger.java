package com.ticker.ticket_bus.models;

import javax.persistence.*;
import java.util.List;
import java.io.Serializable;

@Entity
@Table(name = "passengers")
public class Passenger implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "id_number")
    private int idNumber;

    @Column(name = "gender")
    private String gender;

    @OneToMany(mappedBy = "passenger")
    private List<Booking> bookings;

    @Column(name = "is_admin")
    private boolean isAdmin;

    public Passenger() {
    }

    public Passenger(String name, String lastName, int idNumber, String gender, boolean isAdmin) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.gender = gender;
        this.isAdmin = isAdmin;
    }

    // Getters and Setters...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}