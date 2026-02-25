package edu.icet.repository;


import edu.icet.model.Booking;
import edu.icet.util.Status;

import java.util.List;

public interface BookingRepository {

    void addBooking(Booking booking);
    void updateBooking(Booking booking);
    void deleteBooking(Integer id);
    List<Booking> getAllBooking();
    Booking searchBookingById(Integer id);
    List<Booking> searchBookingByEvent(Integer eventId);
    List<Booking> searchBookingByService(Integer serviceId);
    List<Booking> searchBookingByStatus(Status status);
    List<Booking> searchBookingByPrice(Double price);
}
