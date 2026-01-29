package edu.icet.service;

import edu.icet.dto.BookingDto;
import edu.icet.status.Status;

import java.util.List;

public interface BookingService {
    void addBooking(BookingDto bookingDto);
    void updateBooking(BookingDto bookingDto);
    void deleteBooking(Integer id);
    List<BookingDto> getAllBooking();
    BookingDto searchBookingById(Integer id);
    List<BookingDto> searchBookingByEvent(Integer eventId);
    List<BookingDto> searchBookingByService(Integer serviceId);
    List<BookingDto> searchBookingByStatus(Status status);
    List<BookingDto> searchBookingByPrice(Double price);
}
