package edu.icet.controller;

import edu.icet.dto.PaymentDto;
import edu.icet.service.PaymentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
@Tag(name = "Payment-Controller",description = "Payment API Collection...")
public class PaymentController {

    final PaymentService service;

    @PostMapping("/add/details")
    private void addPayment(@RequestBody PaymentDto payment){
        service.addPayment(payment);
    }

    @PutMapping("/update/details")
    private void updatePayment(@RequestBody PaymentDto payment){
        service.updatePayment(payment);;
    }

    @DeleteMapping("/delete/details")
    public void deletePayment(Integer paymentId){
        service.deletePayment(paymentId);
    }

    @GetMapping("/getAll/details")
    public List<PaymentDto> getAllPaymentDetails(){
        return service.getAllPaymentDetails();
    }

    @GetMapping("/searchById/{paymentId}")
    private PaymentDto searchById(@PathVariable Integer paymentId){
        return service.searchById(paymentId);
    }

    @GetMapping("/searchByAmount/{amount}")
    private List<PaymentDto> searchByAmount(@PathVariable Double amount){
        return service.searchByamount(amount);
    }

    @GetMapping("/searchByPaymentMethod/{paymentMethod}")
    private List<PaymentDto> searchByPaymentMethod(@PathVariable String paymentMethod){
        return service.searchBypaymentMethod(paymentMethod);
    }
}
