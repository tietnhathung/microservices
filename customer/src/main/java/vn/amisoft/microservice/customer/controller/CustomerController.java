package vn.amisoft.microservice.customer.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import vn.amisoft.microservice.customer.model.Customer;
import vn.amisoft.microservice.customer.request.CustomerRequest;
import vn.amisoft.microservice.customer.service.CustomerService;

import java.util.List;


@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRequest customerRequest){
        log.info("new customer registration {}",customerRequest);
        customerService.register(customerRequest);
    }
    @GetMapping
    public List<Customer> all(){
        log.info("new customer registration");
        return customerService.all();
    }
}
