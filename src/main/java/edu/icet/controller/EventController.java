package edu.icet.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Event")
@Tag(name = "Event-Controller",description = "Event API Collection...")
public class EventController {
}
