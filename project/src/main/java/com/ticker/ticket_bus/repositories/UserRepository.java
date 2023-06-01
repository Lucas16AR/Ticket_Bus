package com.ticker.ticket_bus.repositories;
import com.ticker.ticket_bus.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}