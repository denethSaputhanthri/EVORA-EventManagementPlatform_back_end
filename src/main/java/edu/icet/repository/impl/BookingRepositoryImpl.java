package edu.icet.repository.impl;

import edu.icet.model.Booking;
import edu.icet.repository.BookingRepository;
import edu.icet.util.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class BookingRepositoryImpl implements BookingRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void addBooking(Booking booking) {

        String sql = "INSERT INTO booking VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql,
                booking.getBookingId(),
                booking.getEventId(),
                booking.getServiceId(),
                booking.getStatus(),
                booking.getFinalPrice());
    }

    @Override
    public void updateBooking(Booking booking) {
        String sql = "UPDATE booking SET event_id = ? , service_id = ? , status = ? , final_price = ? WHERE booking_id = ?";
        jdbcTemplate.update(sql,
                booking.getEventId(),
                booking.getServiceId(),
                booking.getStatus(),
                booking.getFinalPrice(),
                booking.getBookingId());
    }

    @Override
    public void deleteBooking(Integer id) {
        String sql = "DELETE from booking WHERE booking_id = ? ";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public List<Booking> getAllBooking() {
        String sql = "SELECT * FROM booking";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Booking booking = new Booking();
            booking.setBookingId(rs.getInt(1));
            booking.setServiceId(rs.getInt(2));
            booking.setEventId(rs.getInt(3));
            booking.setStatus(Status.valueOf(rs.getString(4)));
            booking.setFinalPrice(rs.getDouble(5));
            return booking;
        });
    }

    @Override
    public Booking searchBookingById(Integer id) {
        String sql = "SELECT * FROM booking_id = ? ";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            Booking booking = new Booking();
            booking.setBookingId(rs.getInt(1));
            booking.setServiceId(rs.getInt(2));
            booking.setEventId(rs.getInt(3));
            booking.setStatus(Status.valueOf(rs.getString(4)));
            booking.setFinalPrice(rs.getDouble(5));
            return booking;
        },id);
    }

    @Override
    public List<Booking> searchBookingByEvent(Integer eventId) {
        String sql = "SELECT * FROM event_id = ? ";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Booking booking = new Booking();
            booking.setBookingId(rs.getInt(1));
            booking.setServiceId(rs.getInt(2));
            booking.setEventId(rs.getInt(3));
            booking.setStatus(Status.valueOf(rs.getString(4)));
            booking.setFinalPrice(rs.getDouble(5));
            return booking;
        },eventId);
    }

    @Override
    public List<Booking> searchBookingByService(Integer serviceId) {
        String sql = "SELECT * FROM service_id = ? ";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Booking booking = new Booking();
            booking.setBookingId(rs.getInt(1));
            booking.setServiceId(rs.getInt(2));
            booking.setEventId(rs.getInt(3));
            booking.setStatus(Status.valueOf(rs.getString(4)));
            booking.setFinalPrice(rs.getDouble(5));
            return booking;
        },serviceId);
    }

    @Override
    public List<Booking> searchBookingByStatus(Status status) {
        String sql = "SELECT * FROM status = ? ";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Booking booking = new Booking();
            booking.setBookingId(rs.getInt(1));
            booking.setServiceId(rs.getInt(2));
            booking.setEventId(rs.getInt(3));
            booking.setStatus(Status.valueOf(rs.getString(4)));
            booking.setFinalPrice(rs.getDouble(5));
            return booking;
        },status);
    }

    @Override
    public List<Booking> searchBookingByPrice(Double price) {
        String sql = "SELECT * FROM final_price = ? ";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Booking booking = new Booking();
            booking.setBookingId(rs.getInt(1));
            booking.setServiceId(rs.getInt(2));
            booking.setEventId(rs.getInt(3));
            booking.setStatus(Status.valueOf(rs.getString(4)));
            booking.setFinalPrice(rs.getDouble(5));
            return booking;
        },price);
    }
}
