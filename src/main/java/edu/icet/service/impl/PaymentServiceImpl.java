package edu.icet.service.impl;

import edu.icet.Enum.Status;
import edu.icet.dto.PaymentDto;
import edu.icet.service.PaymentService;

import java.time.LocalDate;
import java.util.List;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public void addPayment(PaymentDto payment) {

    }

    @Override
    public void updatePayment(PaymentDto payment) {

    }

    @Override
    public void deletePayment(Integer paymentId) {

    }

    @Override
    public PaymentDto searchById(Integer paymentId) {
        return null;
    }

    @Override
    public List<PaymentDto> getAllPaymentDetails() {
        return List.of();
    }

    @Override
    public List<PaymentDto> searchByamount(Double amount) {
        return List.of();
    }

    @Override
    public List<PaymentDto> searchBypaymentMethod(String paymentMethod) {
        return List.of();
    }

    @Override
    public List<PaymentDto> searchBystatus(Status status) {
        return List.of();
    }

    @Override
    public List<PaymentDto> searchBytransactionDate(LocalDate transactiondate) {
        return List.of();
    }

    @Override
    public PaymentDto searchBybookingId(Integer bookingId) {
        return null;
    }
}
