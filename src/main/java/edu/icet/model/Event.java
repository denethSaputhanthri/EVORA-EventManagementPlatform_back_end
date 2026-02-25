package edu.icet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Event {
    private Integer eventId;
    private Integer userId;
    private String type;
    private String location;
    private LocalDate date;
    private Double budget;
}
