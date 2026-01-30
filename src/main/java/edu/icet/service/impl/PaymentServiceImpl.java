package edu.icet.service.impl;

import edu.icet.Enum.Status;
import edu.icet.dto.PaymentDto;
import edu.icet.entity.PaymentEntity;
import edu.icet.repository.PaymentRepository;
import edu.icet.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    final PaymentRepository repository;
    final ModelMapper mapper;

    @Override
    public void addPayment(PaymentDto payment) {
        repository.save(mapper.map(payment, PaymentEntity.class));
    }

    @Override
    public void updatePayment(PaymentDto payment) {
        repository.save(mapper.map(payment, PaymentEntity.class));
    }

    @Override
    public void deletePayment(Integer paymentId) {
        repository.deleteById(paymentId);
    }

    @Override
    public PaymentDto searchById(Integer paymentId) {
        return mapper.map(repository.findById(paymentId).get(), PaymentDto.class);
    }

    @Override
    public List<PaymentDto> getAllPaymentDetails() {
        List<PaymentEntity>entities=repository.findAll();
        ArrayList<PaymentDto>paymentDtoArrayList=new ArrayList<>();
        entities.forEach(paymentEntity -> {
            paymentDtoArrayList.add(mapper.map(paymentEntity, PaymentDto.class));
        });
        return paymentDtoArrayList;
    }

    @Override
    public List<PaymentDto> searchByamount(Double amount) {
        List<PaymentEntity>entities=repository.findByAmount(amount);
        ArrayList<PaymentDto>paymentDtoArrayList=new ArrayList<>();
        entities.forEach(paymentEntity -> {
            paymentDtoArrayList.add(mapper.map(paymentEntity, PaymentDto.class));
        });
        return paymentDtoArrayList;
    }

    @Override
    public List<PaymentDto> searchBypaymentMethod(String paymentMethod) {
        List<PaymentEntity>entities=repository.findByPaymentMethod(paymentMethod);
        ArrayList<PaymentDto>paymentDtoArrayList=new ArrayList<>();
        entities.forEach(paymentEntity -> {
            paymentDtoArrayList.add(mapper.map(paymentEntity, PaymentDto.class));
        });
        return paymentDtoArrayList;
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
