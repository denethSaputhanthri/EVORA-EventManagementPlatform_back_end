package edu.icet.service.impl;


import edu.icet.model.Payment;
import edu.icet.service.PaymentService;
import edu.icet.util.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void addPayment(Payment payment) {

    }

    @Override
    public void updatePayment(Payment payment) {

    }

    @Override
    public void deletePayment(Integer paymentId) {

    }

    @Override
    public Payment searchById(Integer paymentId) {
        return null;
    }

    @Override
    public List<Payment> getAllPaymentDetails() {
        return List.of();
    }

    @Override
    public List<Payment> searchByamount(Double amount) {
        return List.of();
    }

    @Override
    public List<Payment> searchBypaymentMethod(String paymentMethod) {
        return List.of();
    }

    @Override
    public List<Payment> searchBystatus(Status status) {
        return List.of();
    }

    @Override
    public List<Payment> searchBytransactionDate(LocalDate transactiondate) {
        return List.of();
    }

    @Override
    public Payment searchBybookingId(Integer bookingId) {
        return null;
    }
}
