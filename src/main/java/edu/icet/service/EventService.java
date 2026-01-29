package edu.icet.service;

import edu.icet.dto.EventDto;

import java.time.LocalDate;
import java.util.List;

public interface EventService {
    void addEvent(EventDto event);
    void updateEvent(EventDto event);
    void deleteEvent(Integer eventId);
    List<EventDto>getAllEventDetail();
    EventDto searchById(Integer eventId);
    EventDto searByuserId(Integer userId);
    List<EventDto>searchBytype(String type);
    List<EventDto>searchBylocation(String location);
    List<EventDto>searchBydate(LocalDate date);
    List<EventDto>searchBybudget(Double budget);
}
