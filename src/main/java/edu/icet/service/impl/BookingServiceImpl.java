package edu.icet.service.impl;


import edu.icet.model.Booking;
import edu.icet.repository.BookingRepository;
import edu.icet.service.BookingService;
import edu.icet.util.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookingServiceImpl implements BookingService {

    final BookingRepository bookingRepository;

    @Override
    public void addBooking(Booking booking) {
        bookingRepository.addBooking(booking);
    }

    @Override
    public void updateBooking(Booking booking) {
        bookingRepository.updateBooking(booking);

    }

    @Override
    public void deleteBooking(Integer id) {
        bookingRepository.deleteBooking(id);

    }

    @Override
    public List<Booking> getAllBooking() {
        return bookingRepository.getAllBooking();
    }

    @Override
    public Booking searchBookingById(Integer id) {
        return bookingRepository.searchBookingById(id);
    }

    @Override
    public List<Booking> searchBookingByEvent(Integer eventId) {
        return bookingRepository.searchBookingByEvent(eventId);
    }

    @Override
    public List<Booking> searchBookingByService(Integer serviceId) {
        return bookingRepository.searchBookingByService(serviceId);
    }

    @Override
    public List<Booking> searchBookingByStatus(Status status) {
        return bookingRepository.searchBookingByStatus(status);
    }

    @Override
    public List<Booking> searchBookingByPrice(Double price) {
        return bookingRepository.searchBookingByPrice(price);
    }
}
