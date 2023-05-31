package main.java.com.ticker.Ticket_Bus.services;
import main.java.com.ticker.Ticket_Bus.repositories.UserRepository;
import main.java.com.ticker.Ticket_Bus.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll().orElse(null);
    }
}