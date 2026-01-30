package edu.icet.entity;

import edu.icet.status.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    private Integer eventId;
    private Integer serviceId;
    private Status status;
    private Double finalPrice;
}
