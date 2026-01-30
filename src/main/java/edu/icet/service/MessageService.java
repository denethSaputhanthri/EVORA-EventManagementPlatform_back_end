package edu.icet.service;

import edu.icet.dto.MessageDto;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.time.LocalDate;
import java.util.List;

public interface MessageService {
    void addMessage(MessageDto messageDto);
    void updateMessage(MessageDto messageDto);
    void deleteMessage(Integer id);
    List<MessageDto> getAllMessage();
    MessageDto searchMessageById(Integer id);
    List<MessageDto> searchMessageBySender(Integer senderId);
    List<MessageDto> searchMessageByReceiver(Integer receiverId);
    List<MessageDto> searchMessageByDate(LocalDate date);
}
