package by.anjeikuptsou.buildingsavings.contract.repository;

import by.anjeikuptsou.buildingsavings.contract.domain.AssignedContractor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignedContractorRepository extends CrudRepository<AssignedContractor, Long> {
}
