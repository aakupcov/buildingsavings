package by.anjeikuptsou.business.client.controller;

import by.anjeikuptsou.business.client.domain.Contract;
import by.anjeikuptsou.business.client.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class ContractController {
    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @RequestMapping(value = "/contracts", method = RequestMethod.GET)
    public List<Contract> findAll() {
        return this.contractService.findAll();
    }

    @RequestMapping(value = "/contracts/{contractNumber}", method = RequestMethod.GET)
    public Contract findAll(@PathVariable @NotNull String contractNumber) {
        return this.contractService.findByContractNumber(contractNumber);
    }

    @RequestMapping(value = "/contracts", method = RequestMethod.POST)
    public Contract saveContract(@RequestBody Contract contractToSave) {
        return this.contractService.saveContract(contractToSave);
    }

    @RequestMapping(value = "/contracts", method = RequestMethod.DELETE)
    public Contract deleteContract(@RequestBody Contract contractToDelete) {
        return this.contractService.delete(contractToDelete);
    }
}
