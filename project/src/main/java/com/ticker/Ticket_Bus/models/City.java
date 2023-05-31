import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private int code;

    @Column(name = "name")
    private String name;

    @Column(name = "state")
    private String state;

    @OneToMany(mappedBy = "originCity")
    private List<Trip> originTrips;

    @OneToMany(mappedBy = "destinationCity")
    private List<Trip> destinationTrips;

    @ManyToMany(mappedBy = "cities")
    private List<Company> companies;

    @OneToMany(mappedBy = "originCity")
    private List<Booking> originBookings;

    @OneToMany(mappedBy = "destinationCity")
    private List<Booking> destinationBookings;

    public City() {
        // Constructor vacío requerido por JPA
    }

    public City(int code, String name, String state) {
        this.code = code;
        this.name = name;
        this.state = state;
    }

    // Getters and Setters...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Trip> getOriginTrips() {
        return originTrips;
    }

    public void setOriginTrips(List<Trip> originTrips) {
        this.originTrips = originTrips;
    }

    public List<Trip> getDestinationTrips() {
        return destinationTrips;
    }

    public void setDestinationTrips(List<Trip> destinationTrips) {
        this.destinationTrips = destinationTrips;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Booking> getOriginBookings() {
        return originBookings;
    }

    public void setOriginBookings(List<Booking> originBookings) {
        this.originBookings = originBookings;
    }

    public List<Booking> getDestinationBookings() {
        return destinationBookings;
    }

    public void setDestinationBookings(List<Booking> destinationBookings) {
        this.destinationBookings = destinationBookings;
    }
}