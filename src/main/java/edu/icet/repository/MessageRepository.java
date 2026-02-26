package edu.icet.repository;


import edu.icet.model.Message;

import java.time.LocalDate;
import java.util.List;

public interface MessageRepository {
    void addMessage(Message message);
    void updateMessage(Message message);
    void deleteMessage(Integer id);
    List<Message> getAllMessage();
    Message searchMessageById(Integer id);
    List<Message> searchMessageBySender(Integer senderId);
    List<Message> searchMessageByReceiver(Integer receiverId);
    List<Message> searchMessageByDate(LocalDate date);

}
