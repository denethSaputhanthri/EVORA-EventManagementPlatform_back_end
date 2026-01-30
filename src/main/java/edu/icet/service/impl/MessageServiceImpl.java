package edu.icet.service.impl;

import edu.icet.dto.BookingDto;
import edu.icet.dto.MessageDto;
import edu.icet.entity.BookingEntity;
import edu.icet.entity.MessageEntity;
import edu.icet.repository.MessageRepository;
import edu.icet.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MessageServiceImpl implements MessageService {

    final MessageRepository repository;

    final ModelMapper mapper;

    @Override
    public void addMessage(MessageDto messageDto) {
        repository.save(mapper.map(messageDto, MessageEntity.class));
    }

    @Override
    public void updateMessage(MessageDto messageDto) {
        repository.save(mapper.map(messageDto, MessageEntity.class));
    }

    @Override
    public void deleteMessage(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<MessageDto> getAllMessage() {
        List<MessageEntity> entityList = repository.findAll();
        List<MessageDto> dtoList = new ArrayList<>();

        entityList.forEach(messageEntity -> {
            dtoList.add(mapper.map(messageEntity,MessageDto.class));
        });
        return dtoList;
    }

    @Override
    public MessageDto searchMessageById(Integer id) {
        return mapper.map(repository.findBymessageId(id), MessageDto.class);
    }

    @Override
    public List<MessageDto> searchMessageBySender(Integer senderId) {
        List<MessageEntity> all = repository.findBysenderId(senderId);
        List<MessageDto> dtoList = new ArrayList<>();

        all.forEach(messageEntity -> {
            dtoList.add(mapper.map(messageEntity, MessageDto.class));
        });
        return dtoList;
    }

    @Override
    public List<MessageDto> searchMessageByReceiver(Integer receiverId) {
        List<MessageEntity> all = repository.findByreceiverId(receiverId);
        List<MessageDto> dtoList = new ArrayList<>();

        all.forEach(messageEntity -> {
            dtoList.add(mapper.map(messageEntity, MessageDto.class));
        });

        return dtoList;
    }

    @Override
    public List<MessageDto> searchMessageByDate(LocalDate date) {
        List<MessageEntity> all = repository.findBysentAt(date);
        List<MessageDto> dtoList = new ArrayList<>();

        all.forEach(messageEntity -> {
            dtoList.add(mapper.map(messageEntity, MessageDto.class));
        });
        return dtoList;
    }
}
