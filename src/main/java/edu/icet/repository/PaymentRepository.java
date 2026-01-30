package edu.icet.repository;

import edu.icet.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<PaymentEntity,Integer> {
    List<PaymentEntity> findByAmount(Double amount);
}
