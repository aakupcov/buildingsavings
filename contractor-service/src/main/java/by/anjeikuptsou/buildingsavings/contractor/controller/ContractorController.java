package by.anjeikuptsou.buildingsavings.contractor.controller;

import by.anjeikuptsou.buildingsavings.contractor.domain.Contractor;
import by.anjeikuptsou.buildingsavings.contractor.service.ContractorService;
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
@RequestMapping(value = "/contractors")
@Api(value = "contractors", tags = ("contractors"))
public class ContractorController {
    private ContractorService contractorService;

    @Autowired
    public ContractorController(ContractorService contractorService) {
        this.contractorService = contractorService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Get All Contractors", notes = "Get all contractors in the system", nickname = "getContractors")
    public List<Contractor> findAll() {
        return this.contractorService.findAll();
    }

    @RequestMapping(value = "/{personalNumber}", method = RequestMethod.GET)
    @ApiOperation(value = "Get Contractor", notes = "Get contractor by personal number", nickname = "getContractor")
    public Contractor findByPersonalNumber(@PathVariable @NotNull String personalNumber) {
        return this.contractorService.findByPersonalNumber(personalNumber);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Save Contractor", notes = "Save contractor in the system", nickname = "saveContractor")
    public Contractor saveContractor(@RequestBody Contractor contractorToSave) {
        return this.contractorService.saveContractor(contractorToSave);
    }
}
