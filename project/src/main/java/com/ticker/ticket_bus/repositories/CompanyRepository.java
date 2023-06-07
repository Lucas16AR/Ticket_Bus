package com.ticker.ticket_bus.repositories;
import com.ticker.ticket_bus.models.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}