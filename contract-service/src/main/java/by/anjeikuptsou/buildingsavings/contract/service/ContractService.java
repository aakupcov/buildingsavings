package by.anjeikuptsou.buildingsavings.contract.service;

import by.anjeikuptsou.buildingsavings.contract.domain.AssignedContractor;
import by.anjeikuptsou.buildingsavings.contract.domain.Contract;
import by.anjeikuptsou.buildingsavings.contract.repository.AssignedContractorRepository;
import by.anjeikuptsou.buildingsavings.contract.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {
    private final ContractRepository contractRepository;
    private final AssignedContractorRepository assignedContractorRepository;

    @Autowired
    public ContractService(ContractRepository contractRepository,
                           AssignedContractorRepository assignedContractorRepository) {
        this.contractRepository = contractRepository;
        this.assignedContractorRepository = assignedContractorRepository;
    }

    public List<Contract> findAll() {
        return (List<Contract>) this.contractRepository.findAll();
    }

    public Contract findByContractNumber(String contractNumber) {
        return this.contractRepository.findByContractNumber(contractNumber);
    }

    public Contract saveContract(Contract contractToSave) {
        return this.contractRepository.save(contractToSave);
    }

    public List<AssignedContractor> findAllContractors() {
        return (List<AssignedContractor>) this.assignedContractorRepository.findAll();
    }

    public void deleteContract(Contract contractToDelete) {
        this.contractRepository.delete(contractToDelete);
    }
}