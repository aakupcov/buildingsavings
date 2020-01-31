package by.anjeikuptsou.buildingsavings.contract.service;

import by.anjeikuptsou.buildingsavings.contract.domain.Contract;
import by.anjeikuptsou.buildingsavings.contract.repository.ContractRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ContractService {
    private final ContractRepository contractRepository;

    @Autowired
    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<Contract> findAll(String contractNumber) {
        if (StringUtils.isNotEmpty(contractNumber)) {
            return Collections.singletonList(this.contractRepository.findByContractNumber(contractNumber));
        }
        return (List<Contract>) this.contractRepository.findAll();
    }

    public Contract saveContract(Contract contractToSave) {
        return this.contractRepository.save(contractToSave);
    }
}
