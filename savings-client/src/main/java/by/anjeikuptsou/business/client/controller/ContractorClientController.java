package by.anjeikuptsou.business.client.controller;

import by.anjeikuptsou.business.client.domain.Contractor;
import by.anjeikuptsou.business.client.service.ContractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContractorClientController {
    private ContractorService contractorService;

    @Autowired
    public ContractorClientController(ContractorService contractorService) {
        this.contractorService = contractorService;
    }

    @RequestMapping(value = "/contractors", method = RequestMethod.GET)
    public List<Contractor> findAll(@RequestParam(name = "personalNumber", required = false) String personalNumber) {
        return this.contractorService.findAll(personalNumber);
    }
}
