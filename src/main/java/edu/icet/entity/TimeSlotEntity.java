package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="timeTable")
public class TimeSlotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer timeSlotId;
    private Integer schoolId;
    private LocalTime stratTime;
    private LocalTime endTime;
}
