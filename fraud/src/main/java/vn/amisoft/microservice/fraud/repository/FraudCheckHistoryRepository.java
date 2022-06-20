package vn.amisoft.microservice.fraud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.amisoft.microservice.fraud.model.FraudCheckHistory;

public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Long> {
}