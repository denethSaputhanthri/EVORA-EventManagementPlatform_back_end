package edu.icet.service;

import edu.icet.Enum.Status;
import edu.icet.dto.PaymentDto;

import java.time.LocalDate;
import java.util.List;

public interface PaymentService {
    void addPayment(PaymentDto payment);
    void updatePayment(PaymentDto payment);
    void deletePayment(Integer paymentId);
    PaymentDto searchById(Integer paymentId);
    List<PaymentDto> getAllPaymentDetails();
    List<PaymentDto> searchByamount(Double amount);
    List<PaymentDto> searchBypaymentMethod(String paymentMethod);
    List<PaymentDto> searchBystatus(Status status);
    List<PaymentDto> searchBytransactionDate(LocalDate transactiondate);
    PaymentDto searchBybookingId(Integer bookingId);
}
