package edu.icet.service.impl;

import edu.icet.dto.EventDto;
import edu.icet.entity.EventEntity;
import edu.icet.repository.EventRepository;
import edu.icet.service.EventService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

     final EventRepository repository;
     final ModelMapper mapper;


    @Override
    public void addEvent(EventDto event) {
        repository.save(mapper.map(event, EventEntity.class));
    }

    @Override
    public void updateEvent(EventDto event) {
        repository.save(mapper.map(event, EventEntity.class));
    }

    @Override
    public void deleteEvent(Integer eventId) {
        repository.deleteById(eventId);
    }

    @Override
    public List<EventDto> getAllEventDetail() {
        List<EventEntity>entities=repository.findAll();
        ArrayList<EventDto>eventDtoArrayList=new ArrayList<>();
        entities.forEach(eventEntity -> {
            eventDtoArrayList.add(mapper.map(eventEntity, EventDto.class));
        });
        return eventDtoArrayList;
    }

    @Override
    public EventDto searchById(Integer eventId) {
        return mapper.map(repository.findById(eventId).get(),EventDto.class) ;
    }

    @Override
    public EventDto searByuserId(Integer userId) {
        return mapper.map(repository.findByuserId(userId), EventDto.class);
    }

    @Override
    public List<EventDto> searchBytype(String type) {
        List<EventEntity>entities=repository.findBytype(type);
        ArrayList<EventDto>eventDtoArrayList=new ArrayList<>();
        entities.forEach(eventEntity -> {
            eventDtoArrayList.add(mapper.map(eventEntity, EventDto.class));
        });
        return eventDtoArrayList;
    }

    @Override
    public List<EventDto> searchBylocation(String location) {
        List<EventEntity>entities=repository.findBylocation(location);
        ArrayList<EventDto>eventDtoArrayList=new ArrayList<>();
        entities.forEach(eventEntity -> {
            eventDtoArrayList.add(mapper.map(eventEntity, EventDto.class));
        });
        return eventDtoArrayList;
    }

    @Override
    public List<EventDto> searchBydate(LocalDate date) {
        List<EventEntity>entities=repository.findBydate(date);
        ArrayList<EventDto>eventDtoArrayList=new ArrayList<>();
        entities.forEach(eventEntity -> {
            eventDtoArrayList.add(mapper.map(eventEntity, EventDto.class));
        });
        return eventDtoArrayList;
    }

    @Override
    public List<EventDto> searchBybudget(Double budget) {
        List<EventEntity>entities=repository.findBybudget(budget);
        ArrayList<EventDto>eventDtoArrayList=new ArrayList<>();
        entities.forEach(eventEntity -> {
            eventDtoArrayList.add(mapper.map(eventEntity, EventDto.class));
        });
        return eventDtoArrayList;
    }
}
