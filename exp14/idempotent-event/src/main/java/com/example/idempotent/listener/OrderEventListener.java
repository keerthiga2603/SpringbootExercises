package com.example.idempotent.listener;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.idempotent.event.OrderEvent;
import com.example.idempotent.service.EventStoreService;


@Component
public class OrderEventListener {


    private final EventStoreService store;


    public OrderEventListener(EventStoreService store){
        this.store = store;
    }


    @EventListener
    public void handleOrderEvent(OrderEvent event){


        if(store.isProcessed(event.getEventId())){

            System.out.println(
                "Duplicate Event Ignored : "
                + event.getEventId()
            );

            return;
        }


        store.saveEvent(event.getEventId());


        System.out.println("Processing New Event");
        System.out.println("Event ID : " + event.getEventId());
        System.out.println("Order ID : " + event.getOrderId());

    }
}