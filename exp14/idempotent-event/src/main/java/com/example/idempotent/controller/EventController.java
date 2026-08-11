package com.example.idempotent.controller;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

import com.example.idempotent.event.OrderEvent;


@RestController
@RequestMapping("/event")
public class EventController {


    private final ApplicationEventPublisher publisher;


    public EventController(ApplicationEventPublisher publisher){

        this.publisher = publisher;
    }



    @PostMapping("/send")
    public String sendEvent(){


        OrderEvent event =
                new OrderEvent(
                        "EVT101",
                        101
                );


        publisher.publishEvent(event);


        return "Event Sent";
    }
}