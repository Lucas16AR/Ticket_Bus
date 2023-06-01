package com.ticker.ticket_bus.repositories;
import com.ticker.ticket_bus.models.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {
}