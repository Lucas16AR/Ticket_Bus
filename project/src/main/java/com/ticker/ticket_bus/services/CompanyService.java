package com.ticker.ticket_bus.services;
import com.ticker.ticket_bus.repositories.CompanyRepository;
import com.ticker.ticket_bus.models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

    public Company getCompany(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    Iterable<Company> companyIterable = companyRepository.findAll();
    public CompanyService(Iterable<Company> companyIterable) {
        this.companyIterable = companyIterable;
    }
}