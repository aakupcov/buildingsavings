package by.anjeikuptsou.business.client.controller;

import by.anjeikuptsou.business.client.domain.Contract;
import by.anjeikuptsou.business.client.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContractController {
    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @RequestMapping(value = "/contracts", method = RequestMethod.GET)
    public List<Contract> findAll(@RequestParam(value = "contractNumber", required = false) String contractNumber) {
        return this.contractService.findAll(contractNumber);
    }
}
