package edu.icet.service.impl;

import edu.icet.dto.BookingDto;
import edu.icet.entity.BookingEntity;
import edu.icet.repository.BookingRepository;
import edu.icet.service.BookingService;
import edu.icet.status.Status;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BookingServiceImpl implements BookingService {

    final BookingRepository repository;

    final ModelMapper mapper;

    @Override
    public void addBooking(BookingDto bookingDto) {
        repository.save(mapper.map(bookingDto, BookingEntity.class));
    }

    @Override
    public void updateBooking(BookingDto bookingDto) {
        repository.save(mapper.map(bookingDto, BookingEntity.class));
    }

    @Override
    public void deleteBooking(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<BookingDto> getAllBooking() {
        List<BookingEntity> entity = repository.findAll();
        List<BookingDto> dtoList = new ArrayList<>();

        entity.forEach(bookingEntity ->{
            dtoList.add(mapper.map(bookingEntity, BookingDto.class));
        } );
        return dtoList;
    }

    @Override
    public BookingDto searchBookingById(Integer id) {
        return mapper.map(repository.findBybookingId(id), BookingDto.class);
    }

    @Override
    public List<BookingDto> searchBookingByEvent(Integer eventId) {
        List<BookingEntity> all = repository.findAllByeventId(eventId);
        List<BookingDto> dtoList = new ArrayList<>();

        all.forEach(bookingEntity -> {
            dtoList.add(mapper.map(bookingEntity, BookingDto.class));
        });
        return dtoList;
    }

    @Override
    public List<BookingDto> searchBookingByService(Integer serviceId) {
        List<BookingEntity> all = repository.findAllByserviceId(serviceId);
        List<BookingDto> dtoList = new ArrayList<>();

        all.forEach(bookingEntity -> {
            dtoList.add(mapper.map(bookingEntity, BookingDto.class));
        });
        return dtoList;
    }

    @Override
    public List<BookingDto> searchBookingByStatus(Status status) {
        List<BookingEntity> all = repository.findAllByStatus(status);
        List<BookingDto> dtoList = new ArrayList<>();

        all.forEach(bookingEntity -> {
            dtoList.add(mapper.map(bookingEntity, BookingDto.class));
        });
        return dtoList;
    }

    @Override
    public List<BookingDto> searchBookingByPrice(Double price) {
        List<BookingEntity> all = repository.findAllByfinalPrice(price);
        List<BookingDto> dtoList = new ArrayList<>();

        all.forEach(bookingEntity -> {
            dtoList.add(mapper.map(bookingEntity, BookingDto.class));
        });
        return dtoList;
    }
}
