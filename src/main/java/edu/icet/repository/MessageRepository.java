package edu.icet.repository;

import edu.icet.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MessageRepository extends JpaRepository<MessageEntity,Integer> {
    MessageEntity findBymessageId(Integer messageId);
    List<MessageEntity> findBysenderId(Integer senderId);
    List<MessageEntity> findByreceiverId(Integer receiverId);
    List<MessageEntity> findBysentAt(LocalDate date);
}
