package edu.icet.repository;

import edu.icet.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity,Integer> {
}
