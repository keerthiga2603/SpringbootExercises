package com.example.boundedcontext.order;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {


    private final ApplicationEventPublisher publisher;


    public OrderController(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }


    @PostMapping("/create")
    public String createOrder() {


        OrderPlacedEvent event =
                new OrderPlacedEvent(
                        101,
                        "Designer Kurti"
                );


        publisher.publishEvent(event);


        return "Order Created";
    }
}