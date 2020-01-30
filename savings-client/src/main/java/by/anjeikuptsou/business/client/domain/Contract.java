package by.anjeikuptsou.business.client.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private long id;
    private String contractNumber;
    private String type;
    private int period;
    private LocalDate startDate;
    private BigDecimal balance;
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
