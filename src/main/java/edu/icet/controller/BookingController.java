package edu.icet.controller;

import edu.icet.dto.BookingDto;
import edu.icet.service.BookingService;
import edu.icet.status.Status;
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
    public void addBooking(@RequestBody BookingDto bookingDto){
        service.addBooking(bookingDto);
    }

    @PutMapping("/update")
    public void updateBooking(@RequestBody BookingDto bookingDto){
        service.updateBooking(bookingDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBooking(@PathVariable Integer id){
        service.deleteBooking(id);
    }

    @GetMapping("/search-all")
    public List<BookingDto> getAllBooking(){
        return service.getAllBooking();
    }

    @GetMapping("/search/{id}")
    public BookingDto searchBookingById(@PathVariable Integer id){
        return service.searchBookingById(id);
    }

    @GetMapping("/search-by-event/{eventId}")
    public List<BookingDto> searchBookingByEvent(@PathVariable Integer eventId){
        return service.searchBookingByEvent(eventId);
    }

    @GetMapping("/search-by-service/{serviceId}")
    public List<BookingDto> searchBookingByService(@PathVariable Integer serviceId){
        return service.searchBookingByService(serviceId);
    }

    @GetMapping("/search-by-status/{status}")
    public List<BookingDto> searchBookingByStatus(@PathVariable Status status){
        return service.searchBookingByStatus(status);
    }

    @GetMapping("/seach-by-price/{price}")
    public List<BookingDto> searchBookingByPrice(@PathVariable Double price){
        return service.searchBookingByPrice(price);
    }





}
