package edu.icet.repository;

import edu.icet.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<EventEntity,Integer> {
    EventEntity findByuserId(Integer userId);
    List<EventEntity> findBybudget(Double budget);
    List<EventEntity> findBydate(LocalDate date);
    List<EventEntity> findBytype(String type);
}
