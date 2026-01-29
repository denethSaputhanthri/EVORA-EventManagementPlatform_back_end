package edu.icet.repository;

import edu.icet.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<EventEntity,Integer> {
    EventEntity findByuserId(Integer userId);
    List<EventEntity> findBybudget(Double budget);
}
