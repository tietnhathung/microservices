package vn.amisoft.microservice.customer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import vn.amisoft.microservice.customer.request.CustomerRequest;
import vn.amisoft.microservice.customer.model.Customer;
import vn.amisoft.microservice.customer.repository.CustomerRepository;
import vn.amisoft.microservice.customer.response.FraudCheckResponse;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public void register(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setFirstName(customerRequest.getFistName());
        customer.setLastName(customerRequest.getLastName());
        customer.setEmail(customerRequest.getEmail());
        customerRepository.saveAndFlush(customer);
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject("http://localhost:8081/api/v1/fraud-check/{customerId}", FraudCheckResponse.class, customer.getId());

        if (fraudCheckResponse != null && fraudCheckResponse.getIsFraudster()){
            throw new IllegalStateException("fraudster");
        }


    }
}
