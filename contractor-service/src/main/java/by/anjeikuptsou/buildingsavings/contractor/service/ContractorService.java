package by.anjeikuptsou.buildingsavings.contractor.service;

import by.anjeikuptsou.buildingsavings.contractor.domain.Contractor;
import by.anjeikuptsou.buildingsavings.contractor.repository.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractorService {
    private ContractorRepository contractorRepository;

    @Autowired
    public ContractorService(ContractorRepository contractorRepository) {
        this.contractorRepository = contractorRepository;
    }

    public List<Contractor> findAll() {
        return (List<Contractor>) this.contractorRepository.findAll();
    }

    public Contractor findByPersonalNumber(String personalNumber) {
        return this.contractorRepository.findByPersonalNumber(personalNumber);
    }

    public Contractor saveContractor(Contractor contractorToSave) {
        return this.contractorRepository.save(contractorToSave);
    }
}
