package edu.icet.repository;

import edu.icet.entity.BookingEntity;
import edu.icet.status.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookingEntity,Integer> {
    BookingEntity findBybookingId(Integer id);
    List<BookingEntity> findAllByeventId(Integer eventId);
    List<BookingEntity> findAllByserviceId(Integer serviceId);
    List<BookingEntity> findAllByStatus(Status status);
    List<BookingEntity> findAllByfinalPrice(Double price);
}
