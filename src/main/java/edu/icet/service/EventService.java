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
    List<EventDto>searBytype(String type);
    List<EventDto>searBylocation(String location);
    List<EventDto>searBydate(LocalDate date);
    List<EventDto>searBybudget(Double budget);
}
