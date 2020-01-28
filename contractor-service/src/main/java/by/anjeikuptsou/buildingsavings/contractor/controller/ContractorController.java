package by.anjeikuptsou.buildingsavings.contractor.controller;

import by.anjeikuptsou.buildingsavings.contractor.domain.Contractor;
import by.anjeikuptsou.buildingsavings.contractor.service.ContractorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Contractor> findAll(@RequestParam(name = "personalNumber", required = false) String personalNumber) {
        return this.contractorService.findAll(personalNumber);
    }
}
