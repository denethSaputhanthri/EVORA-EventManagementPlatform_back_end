package edu.icet.repository;


import edu.icet.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository {
    void addEvent(Event event);
    void updateEvent(Event event);
    void deleteEvent(Integer eventId);
    List<Event> getAllEventDetail();
    Event searchById(Integer eventId);
    Event searByuserId(Integer userId);
    List<Event>searchBytype(String type);
    List<Event>searchBylocation(String location);
    List<Event>searchBydate(LocalDate date);
    List<Event>searchBybudget(Double budget);

}
