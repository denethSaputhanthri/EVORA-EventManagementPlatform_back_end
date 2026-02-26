package edu.icet.service.impl;

import edu.icet.model.Message;
import edu.icet.repository.MessageRepository;
import edu.icet.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MessageServiceImpl implements MessageService {

    final private MessageRepository messageRepository;

    @Override
    public void addMessage(Message message) {
        messageRepository.addMessage(message);
    }

    @Override
    public void updateMessage(Message message) {
        messageRepository.updateMessage(message);
    }

    @Override
    public void deleteMessage(Integer id) {
        messageRepository.deleteMessage(id);
    }

    @Override
    public List<Message> getAllMessage() {
        return messageRepository.getAllMessage();
    }

    @Override
    public Message searchMessageById(Integer id) {
        return messageRepository.searchMessageById(id);
    }

    @Override
    public List<Message> searchMessageBySender(Integer senderId) {
        return messageRepository.searchMessageBySender(senderId);
    }

    @Override
    public List<Message> searchMessageByReceiver(Integer receiverId) {
        return messageRepository.searchMessageByReceiver(receiverId);
    }

    @Override
    public List<Message> searchMessageByDate(LocalDate date) {
        return searchMessageByDate(date);
    }
}
