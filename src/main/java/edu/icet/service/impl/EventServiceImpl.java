package edu.icet.service.impl;

import edu.icet.model.Event;
import edu.icet.repository.EventRepository;
import edu.icet.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class EventServiceImpl implements EventService {

    final EventRepository eventRepository;

    @Override
    public void addEvent(Event event) {
        eventRepository.addEvent(event);
    }

    @Override
    public void updateEvent(Event event) {
        eventRepository.updateEvent(event);
    }

    @Override
    public void deleteEvent(Integer eventId) {
        eventRepository.deleteEvent(eventId);
    }

    @Override
    public List<Event> getAllEventDetail(){
        return eventRepository.getAllEventDetail();
    }

    @Override
    public Event searchById(Integer eventId) {
        return eventRepository.searchById(eventId);
    }

    @Override
    public Event searByuserId(Integer userId) {
        return eventRepository.searByuserId(userId);
    }

    @Override
    public List<Event> searchBytype(String type) {
        return eventRepository.searchBytype(type);
    }

    @Override
    public List<Event> searchBylocation(String location) {
        return eventRepository.searchBylocation(location);
    }

    @Override
    public List<Event> searchBydate(LocalDate date) {
        return eventRepository.searchBydate(date);
    }

    @Override
    public List<Event> searchBybudget(Double budget) {
        return eventRepository.searchBybudget(budget);
    }
}
