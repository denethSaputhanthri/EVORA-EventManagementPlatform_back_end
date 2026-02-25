package edu.icet.service;

import edu.icet.model.Message;

import java.time.LocalDate;
import java.util.List;

public interface MessageService {
    void addMessage(Message message);
    void updateMessage(Message message);
    void deleteMessage(Integer id);
    List<Message> getAllMessage();
    Message searchMessageById(Integer id);
    List<Message> searchMessageBySender(Integer senderId);
    List<Message> searchMessageByReceiver(Integer receiverId);
    List<Message> searchMessageByDate(LocalDate date);
}
