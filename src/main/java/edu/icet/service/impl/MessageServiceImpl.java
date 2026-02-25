package edu.icet.service.impl;

import edu.icet.model.Message;
import edu.icet.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public void addMessage(Message message) {

    }

    @Override
    public void updateMessage(Message message) {

    }

    @Override
    public void deleteMessage(Integer id) {

    }

    @Override
    public List<Message> getAllMessage() {
        return List.of();
    }

    @Override
    public Message searchMessageById(Integer id) {
        return null;
    }

    @Override
    public List<Message> searchMessageBySender(Integer senderId) {
        return List.of();
    }

    @Override
    public List<Message> searchMessageByReceiver(Integer receiverId) {
        return List.of();
    }

    @Override
    public List<Message> searchMessageByDate(LocalDate date) {
        return List.of();
    }
}
