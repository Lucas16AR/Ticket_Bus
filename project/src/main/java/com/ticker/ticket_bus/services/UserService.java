package com.ticker.ticket_bus.services;
import com.ticker.ticket_bus.repositories.UserRepository;
import com.ticker.ticket_bus.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    Iterable<User> userIterable = userRepository.findAll();
    public UserService(Iterable<User> userIterable) {
        this.userIterable = userIterable;
    }
}