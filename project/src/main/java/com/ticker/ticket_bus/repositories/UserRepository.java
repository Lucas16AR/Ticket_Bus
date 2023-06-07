package com.ticker.ticket_bus.repositories;
import com.ticker.ticket_bus.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}