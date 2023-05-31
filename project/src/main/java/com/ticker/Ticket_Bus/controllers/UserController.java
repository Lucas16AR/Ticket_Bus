package main.java.com.ticker.Ticket_Bus.controllers;

import com.ticker.Ticket_Bus.models.User;
import com.ticker.Ticket_Bus.repositories.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
    @PutMapping
    public void updateUser(@RequestBody User user) {
        userRepository.save(user);
    }
    @DeleteMapping(value="/deleteUser/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok("User deleted successfully");
    }
}