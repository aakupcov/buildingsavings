package by.anjeikuptsou.buildingsavings.contract.controller;

import by.anjeikuptsou.buildingsavings.contract.domain.AssignedContractor;
import by.anjeikuptsou.buildingsavings.contract.domain.Contract;
import by.anjeikuptsou.buildingsavings.contract.service.ContractService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
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
    public List<Contract> findAll() {
        return this.contractService.findAll();
    }

    @RequestMapping(value = "/{contractNumber}", method = RequestMethod.GET)
    @ApiOperation(value = "Get all contracts", notes = "Get all contracts in the system", nickname = "getContracts")
    public Contract findByContractNumber(@PathVariable @NotNull String contractNumber) {
        return this.contractService.findByContractNumber(contractNumber);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Creat contract", notes = "Creat contract in the system", nickname = "saveContract")
    public Contract saveContract(@RequestBody Contract contractToSave) {
        return this.contractService.saveContract(contractToSave);
    }

    @RequestMapping(value = "/contractors", method = RequestMethod.GET)
    @ApiOperation(value = "Get all contract-contractors", notes = "Get all contract-contractors in the system", nickname = "getAllContractors")
    public List<AssignedContractor> findAllContractors() {
        return this.contractService.findAllContractors();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ApiOperation(value = "Delete contract", notes = "Delete contract in the system", nickname = "deleteContract")
    public Contract deleteContract(@RequestBody Contract contractToDelete) {
        Contract contract = this.contractService.findByContractNumber(contractToDelete.getContractNumber());
        this.contractService.deleteContract(contract);
        return contract;
    }
}