package by.anjeikuptsou.business.client.service;

import by.anjeikuptsou.business.client.domain.Contractor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "CONTRACTORSERVICE")
public interface ContractorService {

    @RequestMapping(value = "/contractors", method = RequestMethod.GET)
    List<Contractor> findAll(@RequestParam(name = "personalNumber", required = false) String personalNumber);
}
