package vn.amisoft.microservice.fraud.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "fraud_check_history")
public class FraudCheckHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "is_fraudster")
    private Boolean isFraudster;

    @Column(name = "create_at")
    private LocalDateTime createAt;
}