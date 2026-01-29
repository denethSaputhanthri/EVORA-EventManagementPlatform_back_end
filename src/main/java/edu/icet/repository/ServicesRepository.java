package edu.icet.repository;

import edu.icet.entity.ServicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicesRepository extends JpaRepository<ServicesEntity,Integer> {
    List<ServicesEntity> findByserviceName(String name);
    List<ServicesEntity> findBybasePrice(Double price);
    List<ServicesEntity> findAllByserviceName(String name);
    List<ServicesEntity> findAllByvendorId(Integer id);
}
