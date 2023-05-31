import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destination")
    private String destination;

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

    public Booking(String origin, String destination, Company company) {
        this.origin = origin;
        this.destination = destination;
        this.company = company;
    }

    // Getters and Setters...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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