package edu.icet.service;

import edu.icet.util.Status;
import edu.icet.model.Payment;

import java.time.LocalDate;
import java.util.List;

public interface PaymentService {
    void addPayment(Payment payment);
    void updatePayment(Payment payment);
    void deletePayment(Integer paymentId);
    Payment searchById(Integer paymentId);
    List<Payment> getAllPaymentDetails();
    List<Payment> searchByamount(Double amount);
    List<Payment> searchBypaymentMethod(String paymentMethod);
    List<Payment> searchBystatus(Status status);
    List<Payment> searchBytransactionDate(LocalDate transactiondate);
    Payment searchBybookingId(Integer bookingId);
}
