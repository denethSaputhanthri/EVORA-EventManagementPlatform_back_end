package edu.icet.repository;

import edu.icet.entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendorRepository extends JpaRepository<VendorEntity, Integer> {
    VendorEntity findByvendorId(Integer vendorId);
    List<VendorEntity> findAllByuserId(Integer userId);
    VendorEntity findBycompanyName(String name);
    VendorEntity findByphone(String phone);
}
