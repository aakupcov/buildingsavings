package by.anjeikuptsou.buildingsavings.contract.domain;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CONTRACT")
public class Contract {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name= "CONTRACT_SEQUENCE", sequenceName = "CONTRACT_SEQUENCE_ID", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.AUTO, generator="CONTRACT_SEQUENCE")
    private long id;

    @Column(name = "CONTRACT_NUMBER")
    private String contractNumber;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "PERIOD")
    private int period;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "BALANCE")
    private BigDecimal balance;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "CONTRACT_CONTRACTOR", joinColumns = @JoinColumn(name = "ID"))
    @Column(name = "CONTRACTOR_NUMBER")
    private List<String> contractorsNumbers = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<String> getContractorsNumbers() {
        return contractorsNumbers;
    }

    public void setContractorsNumbers(List<String> contractorsNumbers) {
        this.contractorsNumbers = contractorsNumbers;
    }
}