package edu.icet.service.impl;


import edu.icet.model.Booking;
import edu.icet.service.BookingService;
import edu.icet.util.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookingServiceImpl implements BookingService {

    @Override
    public void addBooking(Booking booking) {

    }

    @Override
    public void updateBooking(Booking booking) {

    }

    @Override
    public void deleteBooking(Integer id) {

    }

    @Override
    public List<Booking> getAllBooking() {
        return List.of();
    }

    @Override
    public Booking searchBookingById(Integer id) {
        return null;
    }

    @Override
    public List<Booking> searchBookingByEvent(Integer eventId) {
        return List.of();
    }

    @Override
    public List<Booking> searchBookingByService(Integer serviceId) {
        return List.of();
    }

    @Override
    public List<Booking> searchBookingByStatus(Status status) {
        return List.of();
    }

    @Override
    public List<Booking> searchBookingByPrice(Double price) {
        return List.of();
    }
}
