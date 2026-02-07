package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class TimeSlotDTO {
    private Integer timeSlotId;
    private Integer schoolId;
    private LocalTime stratTime;
    private LocalTime endTime;
}
