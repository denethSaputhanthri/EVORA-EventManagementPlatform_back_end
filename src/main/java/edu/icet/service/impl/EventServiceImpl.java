package edu.icet.service.impl;

import edu.icet.model.Event;
import edu.icet.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class EventServiceImpl implements EventService {

    @Override
    public void addEvent(Event event) {

    }

    @Override
    public void updateEvent(Event event) {

    }

    @Override
    public void deleteEvent(Integer eventId) {

    }

    @Override
    public List<Event> getAllEventDetail() {
        return List.of();
    }

    @Override
    public Event searchById(Integer eventId) {
        return null;
    }

    @Override
    public Event searByuserId(Integer userId) {
        return null;
    }

    @Override
    public List<Event> searchBytype(String type) {
        return List.of();
    }

    @Override
    public List<Event> searchBylocation(String location) {
        return List.of();
    }

    @Override
    public List<Event> searchBydate(LocalDate date) {
        return List.of();
    }

    @Override
    public List<Event> searchBybudget(Double budget) {
        return List.of();
    }
}
