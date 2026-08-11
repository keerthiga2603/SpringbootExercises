package com.example.idempotent.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;


@Service
public class EventStoreService {


    private Set<String> processedEvents = new HashSet<>();


    public boolean isProcessed(String eventId){

        return processedEvents.contains(eventId);
    }


    public void saveEvent(String eventId){

        processedEvents.add(eventId);
    }
}