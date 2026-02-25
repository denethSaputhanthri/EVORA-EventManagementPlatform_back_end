package edu.icet.model;


import edu.icet.util.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Booking {
    private Integer bookingId;
    private Integer eventId;
    private Integer serviceId;
    private Status status;
    private Double finalPrice;
}
