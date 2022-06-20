package vn.amisoft.microservice.fraud.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vn.amisoft.microservice.fraud.model.FraudCheckHistory;
import vn.amisoft.microservice.fraud.repository.FraudCheckHistoryRepository;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {
    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;
    public boolean isFraudulentCustomer(Integer customerId) {
        FraudCheckHistory fraudCheckHistory = new FraudCheckHistory();
        fraudCheckHistory.setCustomerId(customerId);
        fraudCheckHistory.setCreateAt(LocalDateTime.now());
        fraudCheckHistory.setIsFraudster(false);
        fraudCheckHistoryRepository.save(fraudCheckHistory);
        return false;
    }
}
