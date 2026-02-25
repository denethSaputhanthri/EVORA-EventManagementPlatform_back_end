package edu.icet.model;

import edu.icet.util.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Payment {
    private Integer paymentId;
    private Integer bookingId;
    private Double amount;
    private String paymentMethod;
    private Status status;
    private LocalDate transactionDate;
}
