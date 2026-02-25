package edu.icet.controller;

import edu.icet.model.Event;
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
@CrossOrigin (origins = "http://127.0.0.1:5501")
public class EventController {

    final EventService service;

    @PostMapping("/add/details")
    public void addEvent(@RequestBody Event event){
        service.addEvent(event);
    }

    @GetMapping("/get/details")
    public List<Event> getAllEvent(){
        return service.getAllEventDetail();
    }

    @PutMapping("/update/details")
    public void updateEvent(@RequestBody Event event){
        service.updateEvent(event);
    }

    @DeleteMapping("/delete/details")
    public void deleteEvent(Integer eventId){
        service.deleteEvent(eventId);
    }

    @GetMapping("/searchById/{eventId}")
    public Event searchById(@PathVariable Integer eventId){
        return service.searchById(eventId);
    }

    @GetMapping("/searchByuserId/{userId}")
    public Event searchByuserId(@PathVariable Integer userId){
        return service.searByuserId(userId);
    }

    @GetMapping("/searchBylocation/{location}")
    public List<Event> searchBylocation(@PathVariable String location){
        return service.searchBylocation(location) ;
    }

    @GetMapping("/searchBytype/{type}")
    public List<Event> searchBytype(@PathVariable String type) {
        return service.searchBytype(type);
    }

    @GetMapping("/searchBydate/{date}")
    public List<Event> searchBydate(@PathVariable LocalDate date){
        return service.searchBydate(date) ;
    }

    @GetMapping("/searchBybudget/{budget}")
    public List<Event> searchBybudget(@PathVariable Double budget) {
        return service.searchBybudget(budget);
    }
}
