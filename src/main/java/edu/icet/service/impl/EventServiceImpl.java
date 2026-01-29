package edu.icet.service.impl;

import edu.icet.dto.EventDto;
import edu.icet.dto.UserDto;
import edu.icet.entity.EventEntity;
import edu.icet.repository.EventRepository;
import edu.icet.role.Role;
import edu.icet.service.EventService;
import edu.icet.service.UserService;
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

    }

    @Override
    public void deleteEvent(Integer eventId) {

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
        return null;
    }

    @Override
    public List<EventDto> searByuserId(Integer userId) {
        return List.of();
    }

    @Override
    public List<EventDto> searBytype(String type) {
        return List.of();
    }

    @Override
    public List<EventDto> searBylocation(String location) {
        return List.of();
    }

    @Override
    public List<EventDto> searBydate(LocalDate date) {
        return List.of();
    }

    @Override
    public List<EventDto> searBybudget(Double budget) {
        return List.of();
    }
}
