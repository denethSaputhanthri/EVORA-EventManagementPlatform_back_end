package edu.icet.controller;

import edu.icet.dto.EventDto;
import edu.icet.service.EventService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
}
