package edu.icet.controller;

import edu.icet.util.Status;
import edu.icet.model.Payment;
import edu.icet.service.PaymentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
@Tag(name = "Payment-Controller",description = "Payment API Collection...")
public class PaymentController {

    final PaymentService service;

    @PostMapping("/add/details")
    private void addPayment(@RequestBody Payment payment){
        service.addPayment(payment);
    }

    @PutMapping("/update/details")
    private void updatePayment(@RequestBody Payment payment){
        service.updatePayment(payment);;
    }

    @DeleteMapping("/delete/details")
    public void deletePayment(Integer paymentId){
        service.deletePayment(paymentId);
    }

    @GetMapping("/getAll/details")
    public List<Payment> getAllPaymentDetails(){
        return service.getAllPaymentDetails();
    }

    @GetMapping("/searchById/{paymentId}")
    private Payment searchById(@PathVariable Integer paymentId){
        return service.searchById(paymentId);
    }

    @GetMapping("/searchByAmount/{amount}")
    private List<Payment> searchByAmount(@PathVariable Double amount){
        return service.searchByamount(amount);
    }

    @GetMapping("/searchByPaymentMethod/{paymentMethod}")
    private List<Payment> searchByPaymentMethod(@PathVariable String paymentMethod){
        return service.searchBypaymentMethod(paymentMethod);
    }

    @GetMapping("/searchByStatus/{status}")
    private List<Payment> searchByStatus(@PathVariable Status status){
        return service.searchBystatus(status);
    }

    @GetMapping("/searchByBookingId/{bookingId}")
    private Payment searchByBookingId(@PathVariable Integer bookingId){
        return service.searchBybookingId(bookingId);
    }

    @GetMapping("/searchByTransactionDate/{transaction}")
    private List<Payment> searchByTransaction(@PathVariable LocalDate transaction){
        return service.searchBytransactionDate(transaction);
    }
}
