# SpringbootExercises

# Spring Boot Microservices & Event-Driven Architecture

This repository contains a collection of practical programs demonstrating **Spring Boot Microservices, REST communication, API Gateway, RabbitMQ, Domain-Driven Design (DDD), Event-Driven Architecture, and Saga patterns**.

Programs

| S. No. | Program Title                                                                                                        || Tools / Technologies  |
| :----: | -------------------------------------------------------------------------------------------------------------------- || --------------------- |
|    1   | Create a basic Spring Boot microservice with one REST endpoint to display service information.                        | Spring Boot           |
|    2   | Develop **Customer Service** and **Order Service** as two independent Spring Boot applications.                       | Spring Boot           |
|    3   | Implement service-to-service communication using **RestTemplate / WebClient**.                                        | Spring Boot           |
|    4   | Implement a simple **API Gateway** route for Customer Service and Order Service.                                      | Spring Boot           |
|    5   | Publish an **OrderCreated** event using Spring Boot and RabbitMQ.                                                     | Spring Boot, RabbitMQ |
|    6   | Consume the **OrderCreated** event in the Payment Service using RabbitMQ.                                             | Spring Boot, RabbitMQ |
|    7   | Implement the **Publish–Subscribe** pattern where Notification Service and Analytics Service consume the same event.  | Spring Boot, RabbitMQ |
|    8   | Implement a **Work Queue** with two competing consumers for order processing.                                         | Spring Boot, RabbitMQ |
|    9   | Implement **retry handling** and route failed messages to a **Dead-Letter Queue (DLQ)**.                              | Spring Boot, RabbitMQ |
|   10   | Create an **Order Aggregate** with Order, OrderItem, and Address classes.                                             | Spring Boot           |
|   11   | Create and publish a domain event named **OrderPlacedEvent**.                                                         | Spring Boot           |
|   12   | Implement an **event handler** that updates the order status after receiving **PaymentCompletedEvent**.               | Spring Boot           |
|   13   | Implement a simple **Saga Choreography** flow for Order, Payment, and Delivery services.                              | Spring Boot           |
|   14   | Implement **idempotent event processing** by storing and checking the event ID.                                       | Spring Boot           |
|   15   | Develop a simple **Bounded Context** example for Order, Payment, and Delivery domains.                                | Spring Boot           |

## Learning Outcomes

* Understand the fundamentals of **Spring Boot Microservices**.
* Implement communication between independent services.
* Configure and use an **API Gateway**.
* Implement asynchronous communication using **RabbitMQ**.
* Understand **Publish–Subscribe** and **Work Queue** messaging patterns.
* Handle message failures using **Retry Mechanisms and Dead-Letter Queues**.
* Apply **Domain-Driven Design (DDD)** concepts.
* Implement **Domain Events and Event Handlers**.
* Understand **Saga Choreography** for distributed transactions.
* Implement **Idempotent Event Processing**.
* Understand **Bounded Contexts** in microservice architecture.

## Technologies Used

* Java
* Spring Boot
* Spring Cloud
* RabbitMQ
* REST API
* Maven
* Microservices Architecture
* Domain-Driven Design (DDD)
* Event-Driven Architecture
