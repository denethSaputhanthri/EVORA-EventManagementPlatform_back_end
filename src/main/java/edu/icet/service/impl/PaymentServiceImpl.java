package edu.icet.service.impl;


import edu.icet.model.Payment;
import edu.icet.repository.PaymentRepository;
import edu.icet.service.PaymentService;
import edu.icet.util.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {

    final PaymentRepository paymentRepository;

    @Override
    public void addPayment(Payment payment) {
        paymentRepository.addPayment(payment);
    }

    @Override
    public void updatePayment(Payment payment) {
        paymentRepository.updatePayment(payment);
    }

    @Override
    public void deletePayment(Integer paymentId) {
        paymentRepository.deletePayment(paymentId);
    }

    @Override
    public Payment searchById(Integer paymentId) {
        return paymentRepository.searchById(paymentId);
    }

    @Override
    public List<Payment> getAllPaymentDetails() {
        return paymentRepository.getAllPaymentDetails();
    }

    @Override
    public List<Payment> searchByamount(Double amount) {
        return paymentRepository.searchByamount(amount);
    }

    @Override
    public List<Payment> searchBypaymentMethod(String paymentMethod) {
        return paymentRepository.searchBypaymentMethod(paymentMethod);
    }

    @Override
    public List<Payment> searchBystatus(Status status) {
        return paymentRepository.searchBystatus(status);
    }

    @Override
    public List<Payment> searchBytransactionDate(LocalDate transactionDate) {
        return paymentRepository.searchBytransactionDate(transactionDate);
    }

    @Override
    public Payment searchBybookingId(Integer bookingId) {
        return searchBybookingId(bookingId);
    }
}
