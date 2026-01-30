package edu.icet.controller;

import edu.icet.dto.PaymentDto;
import edu.icet.service.PaymentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
@Tag(name = "Payment-Controller",description = "Payment API Collection...")
public class PaymentController {

    final PaymentService service;
    private void addPayment(PaymentDto payment){
        service.addPayment(payment);
    }
}
