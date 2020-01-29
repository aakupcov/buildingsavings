package by.anjeikuptsou.buildingsavings.contract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.any;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class ContractServiceApplication {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Contract").select()
                .apis(RequestHandlerSelectors.basePackage("by.anjeikuptsou.buildingsavings.contract.controller"))
                .paths(any()).build().apiInfo(new ApiInfo(
                        "Contract Service",
                        "A set of services to provide data access to contracts",
                        "1.0.0",
                        null,
                        new Contact("Anjei Kuptsou", "https://www.linkedin.com/in/andrei-kuptsou-903aba124/", null),
                        null,
                        null,
                        new ArrayList<VendorExtension>()));
    }

    public static void main(String[] args) {
        SpringApplication.run(ContractServiceApplication.class, args);
    }

}
