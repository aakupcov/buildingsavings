package by.anjeikuptsou.business.client.controller;

import by.anjeikuptsou.business.client.domain.Contractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ContractorClientController {
    private RestTemplate restTemplate;

    @Autowired
    public ContractorClientController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/contractors", method = RequestMethod.GET)
    public List<Contractor> findAll() {
        ResponseEntity<List<Contractor>> contractorsResponse = this.restTemplate.exchange(
                "http://CONTRACTORSERVICE/contractors", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Contractor>>() {
                });
        return contractorsResponse.getBody();
    }
}
