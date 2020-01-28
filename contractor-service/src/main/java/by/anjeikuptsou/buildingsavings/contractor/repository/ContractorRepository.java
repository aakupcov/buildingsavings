package by.anjeikuptsou.buildingsavings.contractor.repository;

import by.anjeikuptsou.buildingsavings.contractor.domain.Contractor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractorRepository extends CrudRepository<Contractor, Long> {
    Contractor findByPersonalNumber(String personalNumber);
}
