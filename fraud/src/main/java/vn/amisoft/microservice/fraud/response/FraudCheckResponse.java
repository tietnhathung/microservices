package vn.amisoft.microservice.fraud.response;

import lombok.Data;

@Data
public class FraudCheckResponse {
    private Boolean isFraudster;

    public FraudCheckResponse(Boolean isFraudster) {
        this.isFraudster = isFraudster;
    }
}
