package edu.icet.dto;

import edu.icet.status.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookingDto {
    private Integer bookingId;
    private Integer eventId;
    private Integer serviceId;
    private Status status;
    private Double finalPrice;
}
