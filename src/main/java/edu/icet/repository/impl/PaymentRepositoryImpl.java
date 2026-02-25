package edu.icet.repository.impl;

import edu.icet.model.Payment;
import edu.icet.repository.PaymentRepository;
import edu.icet.util.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PaymentRepositoryImpl implements PaymentRepository {

    final JdbcTemplate jdbcTemplate;

    @Override
    public void addPayment(Payment payment) {
        String sql = "INSERT INTO payment VALUES(?,?,?,?,?,?)";
        jdbcTemplate.update(sql,
                payment.getPaymentId(),
                payment.getBookingId(),
                payment.getAmount(),
                payment.getPaymentMethod(),
                payment.getStatus().name(),
                payment.getTransactionDate());
    }

    @Override
    public void updatePayment(Payment payment) {
        String sql = "UPDATE payment SET booking_id = ? , amount = ? , payment_method = ? , status = ? , transaction_date = ? WHERE payment_id = ?";
        jdbcTemplate.update(sql,
                payment.getBookingId(),
                payment.getAmount(),
                payment.getPaymentMethod(),
                payment.getStatus(),
                payment.getTransactionDate(),
                payment.getPaymentId());
    }

    @Override
    public void deletePayment(Integer paymentId) {
        String sql = "DELETE FROM payment WHERE payment_id = ?";
        jdbcTemplate.update(sql,paymentId);
    }

    @Override
    public Payment searchById(Integer paymentId) {
        return null;
    }

    @Override
    public List<Payment> getAllPaymentDetails() {
        String sql = "SELECT * FROM payment";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Payment payment = new Payment();
            payment.setPaymentId(rs.getInt(1));
            payment.setBookingId(rs.getInt(2));
            payment.setAmount(rs.getDouble(3));
            payment.setPaymentMethod(rs.getString(4));
            payment.setStatus(Status.valueOf(rs.getString(5)));
            payment.setTransactionDate(LocalDate.parse(rs.getString(6)));
            return payment;
        });
    }

    @Override
    public List<Payment> searchByamount(Double amount) {
        String sql = "SELECT * FROM payment WHERE amount = ?";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Payment payment = new Payment();
            payment.setPaymentId(rs.getInt(1));
            payment.setBookingId(rs.getInt(2));
            payment.setAmount(rs.getDouble(3));
            payment.setPaymentMethod(rs.getString(4));
            payment.setStatus(Status.valueOf(rs.getString(5)));
            payment.setTransactionDate(LocalDate.parse(rs.getString(6)));
            return payment;
        },amount);
    }

    @Override
    public List<Payment> searchBypaymentMethod(String paymentMethod) {
        String sql = "SELECT * FROM payment WHERE paymentMethod = ?";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Payment payment = new Payment();
            payment.setPaymentId(rs.getInt(1));
            payment.setBookingId(rs.getInt(2));
            payment.setAmount(rs.getDouble(3));
            payment.setPaymentMethod(rs.getString(4));
            payment.setStatus(Status.valueOf(rs.getString(5)));
            payment.setTransactionDate(LocalDate.parse(rs.getString(6)));
            return payment;
        },paymentMethod);
    }

    @Override
    public List<Payment> searchBystatus(Status status) {
        String sql = "SELECT * FROM payment WHERE status = ?";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Payment payment = new Payment();
            payment.setPaymentId(rs.getInt(1));
            payment.setBookingId(rs.getInt(2));
            payment.setAmount(rs.getDouble(3));
            payment.setPaymentMethod(rs.getString(4));
            payment.setStatus(Status.valueOf(rs.getString(5)));
            payment.setTransactionDate(LocalDate.parse(rs.getString(6)));
            return payment;
        },status);
    }

    @Override
    public List<Payment> searchBytransactionDate(LocalDate transactiondate) {
        String sql = "SELECT * FROM payment WHERE transaction_date = ?";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Payment payment = new Payment();
            payment.setPaymentId(rs.getInt(1));
            payment.setBookingId(rs.getInt(2));
            payment.setAmount(rs.getDouble(3));
            payment.setPaymentMethod(rs.getString(4));
            payment.setStatus(Status.valueOf(rs.getString(5)));
            payment.setTransactionDate(LocalDate.parse(rs.getString(6)));
            return payment;
        },transactiondate);
    }

    @Override
    public Payment searchBybookingId(Integer bookingId) {
        String sql = "SELECT * FROM payment WHERE booking_id = ?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            Payment payment = new Payment();
            payment.setPaymentId(rs.getInt(1));
            payment.setBookingId(rs.getInt(2));
            payment.setAmount(rs.getDouble(3));
            payment.setPaymentMethod(rs.getString(4));
            payment.setStatus(Status.valueOf(rs.getString(5)));
            payment.setTransactionDate(LocalDate.parse(rs.getString(6)));
            return payment;
        },bookingId);
    }
}
