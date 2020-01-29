package by.anjeikuptsou.business.client.service;

import by.anjeikuptsou.business.client.domain.Contract;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "CONTRACTSERVICE")
public interface ContractService {

    @RequestMapping(value = "/contracts", method = RequestMethod.GET)
    List<Contract> findAll(@RequestParam(value = "contractNumber", required = false) String contractNumber);
}
