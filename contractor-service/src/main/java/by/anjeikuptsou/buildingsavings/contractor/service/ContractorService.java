package by.anjeikuptsou.buildingsavings.contractor.service;

import by.anjeikuptsou.buildingsavings.contractor.domain.Contractor;
import by.anjeikuptsou.buildingsavings.contractor.repository.ContractorRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ContractorService {
    private ContractorRepository contractorRepository;

    @Autowired
    public ContractorService(ContractorRepository contractorRepository) {
        this.contractorRepository = contractorRepository;
    }

    public List<Contractor> findAll(String personalNumber) {
        if (StringUtils.isNotEmpty(personalNumber)) {
            return Collections.singletonList(this.contractorRepository.findByPersonalNumber(personalNumber));
        }
        return (List<Contractor>) this.contractorRepository.findAll();
    }
}
