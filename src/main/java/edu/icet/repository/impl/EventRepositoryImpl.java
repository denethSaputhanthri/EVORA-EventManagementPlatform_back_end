package edu.icet.repository.impl;

import edu.icet.model.Event;
import edu.icet.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class EventRepositoryImpl implements EventRepository {

    final private JdbcTemplate jdbcTemplate;

    @Override
    public void addEvent(Event event) {
        String sql = "INSERT INTO event VALUES(?,?,?,?,?,?)";
        jdbcTemplate.update(sql,
                event.getEventId(),
                event.getUserId(),
                event.getType(),
                event.getDate(),
                event.getBudget(),
                event.getLocation());
    }

    @Override
    public void updateEvent(Event event) {
        String sql = "UPDATE event SET user_id = ? , event_type = ? , event_date = ? , total_budget = ? , location = ? WHERE event_id = ?";
        jdbcTemplate.update(sql,
                event.getUserId(),
                event.getType(),
                event.getDate(),
                event.getBudget(),
                event.getLocation(),
                event.getEventId());
    }

    @Override
    public void deleteEvent(Integer eventId) {
        String sql = "DELETE FROM event WHERE event_id = ?";
        jdbcTemplate.update(sql,eventId);
    }

    @Override
    public List<Event> getAllEventDetail() {
        String sql = "SELECT * FROM event";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Event event = new Event();
            event.setEventId(rs.getInt(1));
            event.setUserId(rs.getInt(2));
            event.setType(rs.getString(3));
            event.setDate(LocalDate.parse(rs.getString(4)));
            event.setBudget(rs.getDouble(5));
            event.setLocation(rs.getString(6));
            return event;
        });
    }

    @Override
    public Event searchById(Integer eventId) {
        String sql = "SELECT * FROM event WHERE event_id = ?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            Event event = new Event();
            event.setEventId(rs.getInt(1));
            event.setUserId(rs.getInt(2));
            event.setType(rs.getString(3));
            event.setDate(LocalDate.parse(rs.getString(4)));
            event.setBudget(rs.getDouble(5));
            event.setLocation(rs.getString(6));
            return event;
        },eventId);
    }

    @Override
    public Event searByuserId(Integer userId) {
        String sql = "SELECT * FROM event WHERE user_id = ?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            Event event = new Event();
            event.setEventId(rs.getInt(1));
            event.setUserId(rs.getInt(2));
            event.setType(rs.getString(3));
            event.setDate(LocalDate.parse(rs.getString(4)));
            event.setBudget(rs.getDouble(5));
            event.setLocation(rs.getString(6));
            return event;
        },userId);
    }

    @Override
    public List<Event> searchBytype(String type) {
        String sql = "SELECT * FROM event WHERE event_id = ?";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Event event = new Event();
            event.setEventId(rs.getInt(1));
            event.setUserId(rs.getInt(2));
            event.setType(rs.getString(3));
            event.setDate(LocalDate.parse(rs.getString(4)));
            event.setBudget(rs.getDouble(5));
            event.setLocation(rs.getString(6));
            return event;
        },type);
    }

    @Override
    public List<Event> searchBylocation(String location) {
        String sql = "SELECT * FROM event WHERE location = ?";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Event event = new Event();
            event.setEventId(rs.getInt(1));
            event.setUserId(rs.getInt(2));
            event.setType(rs.getString(3));
            event.setDate(LocalDate.parse(rs.getString(4)));
            event.setBudget(rs.getDouble(5));
            event.setLocation(rs.getString(6));
            return event;
        },location);
    }

    @Override
    public List<Event> searchBydate(LocalDate date) {
        String sql = "SELECT * FROM event WHERE date = ?";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Event event = new Event();
            event.setEventId(rs.getInt(1));
            event.setUserId(rs.getInt(2));
            event.setType(rs.getString(3));
            event.setDate(LocalDate.parse(rs.getString(4)));
            event.setBudget(rs.getDouble(5));
            event.setLocation(rs.getString(6));
            return event;
        },date);
    }

    @Override
    public List<Event> searchBybudget(Double budget) {
        String sql = "SELECT * FROM event WHERE date = ?";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Event event = new Event();
            event.setEventId(rs.getInt(1));
            event.setUserId(rs.getInt(2));
            event.setType(rs.getString(3));
            event.setDate(LocalDate.parse(rs.getString(4)));
            event.setBudget(rs.getDouble(5));
            event.setLocation(rs.getString(6));
            return event;
        },budget);
    }
}
