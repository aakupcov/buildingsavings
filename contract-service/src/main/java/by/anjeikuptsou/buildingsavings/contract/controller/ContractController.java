package by.anjeikuptsou.buildingsavings.contract.controller;

import by.anjeikuptsou.buildingsavings.contract.domain.Contract;
import by.anjeikuptsou.buildingsavings.contract.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contracts")
public class ContractController {
    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Contract> findAll(@RequestParam(name = "contractNumber", required = false) String contractNumber) {
        return this.contractService.findAll(contractNumber);
    }
}
