package vn.amisoft.microservice.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.amisoft.microservice.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}