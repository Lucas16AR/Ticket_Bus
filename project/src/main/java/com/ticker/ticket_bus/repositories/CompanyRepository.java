package com.ticker.ticket_bus.repositories;
import org.springframework.data.repository.CrudRepository;

import com.ticker.ticket_bus.models.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}