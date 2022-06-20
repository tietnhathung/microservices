package vn.amisoft.microservice.customer.request;

import lombok.Data;

@Data
public class CustomerRequest {
    String fistName;
    String lastName;
    String email;
}
