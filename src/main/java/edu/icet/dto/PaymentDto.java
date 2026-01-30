package edu.icet.dto;

import edu.icet.Enum.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PaymentDto {
    private Integer paymentId;
    private Integer bookingId;
    private Double amount;
    private String paymentMethod;
    private Status status;
    private LocalDate transactionDate;
}
