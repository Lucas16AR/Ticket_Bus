package main.java.com.ticker.Ticket_Bus.models;

import javax.persistence.*;
import java.util.List;
import java.io.Serializable;

import com.ticker.Ticket_Bus.models.Booking;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private int password;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;

    @Column(name = "is_admin")
    private boolean isAdmin;

    public User() {
        // Empty constructor required by JPA
    }

    public User(String name, String lastName, int password, String email, boolean isAdmin) {
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.isAdmin = isAdmin;
    }

    // Getters and Setters...

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for password
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for bookings
    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    // Getter and Setter for isAdmin
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}