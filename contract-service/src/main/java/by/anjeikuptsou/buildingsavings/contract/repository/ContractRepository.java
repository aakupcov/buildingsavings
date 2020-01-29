package by.anjeikuptsou.buildingsavings.contract.repository;

import by.anjeikuptsou.buildingsavings.contract.domain.Contract;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends CrudRepository<Contract, Long> {
    Contract findByContractNumber(String contractNumber);
}