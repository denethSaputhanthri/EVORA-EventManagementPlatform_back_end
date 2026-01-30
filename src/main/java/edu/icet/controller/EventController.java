package edu.icet.controller;

import edu.icet.dto.EventDto;
import edu.icet.service.EventService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Event")
@Tag(name = "Event-Controller",description = "Event API Collection...")
public class EventController {

    final EventService service;

    @PostMapping("/add/details")
    public void addEvent(@RequestBody EventDto event){
        service.addEvent(event);
    }

    @GetMapping("/get/details")
    public List<EventDto> getAllEvent(){
        return service.getAllEventDetail();
    }

    @PutMapping("/update/details")
    public void updateEvent(@RequestBody EventDto event){
        service.updateEvent(event);
    }

    @DeleteMapping("/delete/details")
    public void deleteEvent(Integer eventId){
        service.deleteEvent(eventId);
    }

    @GetMapping("/searchById/{eventId}")
    public EventDto searchById(@PathVariable Integer eventId){
        return service.searchById(eventId);
    }

    @GetMapping("/searchByuserId/{userId}")
    public EventDto searchByuserId(@PathVariable Integer userId){
        return service.searByuserId(userId);
    }

    @GetMapping("/searchBylocation/{location}")
    public List<EventDto> searchBylocation(String location){
        return service.searchBylocation(location) ;
    }

    @GetMapping("/searchBytype/{type}")
    public List<EventDto> searchBytype(String type) {
        return service.searchBytype(type);
    }

    @GetMapping("/searchBydate/{date}")
    public List<EventDto> searchBydate(LocalDate date){
        return service.searchBydate(date) ;
    }

    @GetMapping("/searchBybudget/{budget}")
    public List<EventDto> searchBybudget(Double budget) {
        return service.searchBybudget(budget);
    }
}
