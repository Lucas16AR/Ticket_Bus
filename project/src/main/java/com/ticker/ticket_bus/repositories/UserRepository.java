package com.ticker.ticket_bus.repositories;
import org.springframework.data.repository.CrudRepository;

import com.ticker.ticket_bus.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
}