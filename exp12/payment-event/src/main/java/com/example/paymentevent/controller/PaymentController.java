package com.example.paymentevent.controller;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

import com.example.paymentevent.event.PaymentCompletedEvent;


@RestController
@RequestMapping("/payment")
public class PaymentController {


    private final ApplicationEventPublisher publisher;


    public PaymentController(ApplicationEventPublisher publisher){
        this.publisher = publisher;
    }


    @PostMapping("/complete")
    public String completePayment(){

        PaymentCompletedEvent event =
                new PaymentCompletedEvent(
                        101,
                        "PAY123"
                );


        publisher.publishEvent(event);


        return "Payment completed";
    }
}