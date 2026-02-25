package edu.icet.controller;

import edu.icet.util.Status;
import edu.icet.model.Booking;
import edu.icet.service.BookingService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Booking")
@Tag(name = "Booking-Controller" , description = "Booking API Collection")
public class BookingController {

    final BookingService service;

    @PostMapping("/add")
    public void addBooking(@RequestBody Booking booking){
        service.addBooking(booking);
    }

    @PutMapping("/update")
    public void updateBooking(@RequestBody Booking booking){
        service.updateBooking(booking);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBooking(@PathVariable Integer id){
        service.deleteBooking(id);
    }

    @GetMapping("/search-all")
    public List<Booking> getAllBooking(){
        return service.getAllBooking();
    }

    @GetMapping("/search/{id}")
    public Booking searchBookingById(@PathVariable Integer id){
        return service.searchBookingById(id);
    }

    @GetMapping("/search-by-event/{eventId}")
    public List<Booking> searchBookingByEvent(@PathVariable Integer eventId){
        return service.searchBookingByEvent(eventId);
    }

    @GetMapping("/search-by-service/{serviceId}")
    public List<Booking> searchBookingByService(@PathVariable Integer serviceId){
        return service.searchBookingByService(serviceId);
    }

    @GetMapping("/search-by-status/{status}")
    public List<Booking> searchBookingByStatus(@PathVariable Status status){
        return service.searchBookingByStatus(status);
    }

    @GetMapping("/search-by-price/{price}")
    public List<Booking> searchBookingByPrice(@PathVariable Double price){
        return service.searchBookingByPrice(price);
    }
}
