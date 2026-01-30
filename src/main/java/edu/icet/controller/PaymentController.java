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
    @GetMapping("/getAll/details")
    public List<PaymentDto> getAllPaymentDetails(){
        return service.getAllPaymentDetails();
    }
}
