package edu.icet.repository;

import edu.icet.entity.ServicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicesRepository extends JpaRepository<ServicesEntity,Integer> {
}
