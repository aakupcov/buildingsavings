package by.anjeikuptsou.buildingsavings.contractor.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRACTOR")
public class Contractor {
    @Id
    @Column(name = "CONTRACTOR_ID")
    @SequenceGenerator(name= "CONTRACTOR_SEQUENCE", sequenceName = "CONTRACTOR_SEQUENCE_ID", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.AUTO, generator="CONTRACTOR_SEQUENCE")
    private long contractorId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PERSONAL_NUMBER")
    private String personalNumber;

    public long getContractorId() {
        return contractorId;
    }

    public void setContractorId(long contractorId) {
        this.contractorId = contractorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }
}
