package edu.icet.repository;

import edu.icet.dto.ReviewDto;
import edu.icet.entity.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Integer> {
    ReviewEntity findByreviewId(Integer id);
    List<ReviewEntity> findAllByuserId(Integer userId);
    List<ReviewEntity> findAllByserviceId(Integer serviceId);
    List<ReviewEntity> findAllByrating(Integer rating);
    List<ReviewEntity> findAllBycreatedAt(LocalDate date);
}
