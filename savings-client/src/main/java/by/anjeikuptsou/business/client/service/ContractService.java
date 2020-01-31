package by.anjeikuptsou.business.client.service;

import by.anjeikuptsou.business.client.domain.Contract;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.constraints.NotNull;
import java.util.List;

@FeignClient(value = "CONTRACTSERVICE")
public interface ContractService {

    @RequestMapping(value = "/contracts", method = RequestMethod.GET)
    List<Contract> findAll();

    @RequestMapping(value = "/contracts/{contractNumber}", method = RequestMethod.GET)
    Contract findByContractNumber(@PathVariable @NotNull String contractNumber);

    @RequestMapping(value = "/contracts", method = RequestMethod.POST)
    Contract saveContract(@RequestBody Contract contractToSave);

    @RequestMapping(value = "/contracts", method = RequestMethod.DELETE)
    Contract delete(@RequestBody Contract contractToDelete);
}
