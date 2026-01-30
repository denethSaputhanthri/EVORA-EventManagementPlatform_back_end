package edu.icet.repository;

import edu.icet.dto.WishlistDto;
import edu.icet.entity.WishlistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface WishlistRepository extends JpaRepository<WishlistEntity,Integer> {
    List<WishlistEntity> findAllByuserId(Integer userId);
    List<WishlistEntity> findAllByserviceId(Integer serviceId);
    List<WishlistEntity> findAllByaddedAt(LocalDateTime time);
}
