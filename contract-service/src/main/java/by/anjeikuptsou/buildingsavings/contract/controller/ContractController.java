package by.anjeikuptsou.buildingsavings.contract.controller;

import by.anjeikuptsou.buildingsavings.contract.domain.Contract;
import by.anjeikuptsou.buildingsavings.contract.service.ContractService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contracts")
@Api(value = "contracts", description = "Data service operations on contracts", tags = ("contracts"))
public class ContractController {
    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Get all contracts", notes = "Get all contracts in the system", nickname = "getContracts")
    public List<Contract> findAll(@RequestParam(name = "contractNumber", required = false) String contractNumber) {
        return this.contractService.findAll(contractNumber);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Creat contract", notes = "Creat contract in the system", nickname = "saveContract")
    public Contract saveContract(@RequestBody Contract contractToSave) {
        return this.contractService.saveContract(contractToSave);
    }
}
