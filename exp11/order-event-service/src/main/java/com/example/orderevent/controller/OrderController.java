package com.example.orderevent.controller;

import com.example.orderevent.event.OrderPlacedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
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
                        "Rasika",
                        2500
                );

        publisher.publishEvent(event);

        return "Order placed successfully";
    }
}