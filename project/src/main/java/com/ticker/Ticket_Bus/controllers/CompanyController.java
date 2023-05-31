package main.java.com.ticker.Ticket_Bus.controllers;

import com.ticker.Ticket_Bus.models.Company;
import com.ticker.Ticket_Bus.repositories.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping
    public List<Company> getAllCompany() {
        return (List<Company>) companyRepository.findAll();
    }

    @PostMapping
    public void addCompany(@RequestBody Company company) {
        companyRepository.save(company);
    }
    @PutMapping
    public void updateCompany(@RequestBody Company company) {
        companyRepository.save(company);
    }
    @DeleteMapping(value="/deleteCompany/{id}")
    public ResponseEntity<String> deleteCompany(@PathVariable("id") Long id) {
        companyRepository.deleteById(id);
        return ResponseEntity.ok("Company deleted successfully");
    }
}