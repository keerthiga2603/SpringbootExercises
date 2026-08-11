package com.example.saga.controller;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

import com.example.saga.event.OrderPlacedEvent;


@RestController
@RequestMapping("/order")
public class OrderController {


    private final ApplicationEventPublisher publisher;


    public OrderController(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }


    @PostMapping("/place")
    public String placeOrder() {


        OrderPlacedEvent event =
                new OrderPlacedEvent(
                        101,
                        "Rasika"
                );


        publisher.publishEvent(event);


        return "Order placed";
    }
}