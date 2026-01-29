package edu.icet.controller;

import edu.icet.service.EventService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Event")
@Tag(name = "Event-Controller",description = "Event API Collection...")
public class EventController {

    final EventService service;

}
