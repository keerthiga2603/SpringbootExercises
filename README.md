# Spring Boot Microservices & Event-Driven Architecture

This repository contains a collection of practical programs demonstrating **Spring Boot Microservices, REST communication, API Gateway, RabbitMQ, Domain-Driven Design (DDD), Event-Driven Architecture, and Saga patterns.**

---

## 📚 Programs

### CO1 – Microservices & REST Communication

**1. Basic Spring Boot Microservice**
Create a basic Spring Boot microservice with one REST endpoint to display service information.

**2. Customer & Order Services**
Develop Customer Service and Order Service as two independent Spring Boot applications.

**3. Service-to-Service Communication**
Implement communication between services using `RestTemplate` or `WebClient`.

**4. API Gateway**
Implement a simple API Gateway to route requests to Customer Service and Order Service.

---

### CO2 – Event-Driven Architecture with RabbitMQ

**5. Publish OrderCreated Event**
Publish an `OrderCreated` event using Spring Boot and RabbitMQ.

**6. Consume OrderCreated Event**
Consume the `OrderCreated` event in the Payment Service using RabbitMQ.

**7. Publish–Subscribe Pattern**
Implement a Publish–Subscribe pattern where Notification Service and Analytics Service consume the same event.

**8. Work Queue Pattern**
Implement a Work Queue with two competing consumers for order processing.

**9. Retry & Dead-Letter Queue**
Implement retry handling and route failed messages to a Dead-Letter Queue (DLQ).

---

### CO3 – Domain-Driven Design & Distributed Systems

**10. Order Aggregate**
Create an Order Aggregate containing:

* Order
* OrderItem
* Address

**11. Domain Event**
Create and publish a domain event named `OrderPlacedEvent`.

**12. Event Handler**
Implement an event handler that updates the order status after receiving `PaymentCompletedEvent`.

**13. Saga Choreography**
Implement a simple Saga Choreography flow involving:

* Order Service
* Payment Service
* Delivery Service

**14. Idempotent Event Processing**
Implement idempotent event processing by storing and checking the event ID to prevent duplicate event processing.

**15. Bounded Context**
Develop a simple Bounded Context example for:

* Order Domain
* Payment Domain
* Delivery Domain

---

## 🎯 Learning Outcomes

Through these exercises, you will learn how to:

* Build **Spring Boot Microservices**
* Develop and consume **REST APIs**
* Implement **service-to-service communication**
* Configure an **API Gateway**
* Implement asynchronous communication using **RabbitMQ**
* Understand **Publish–Subscribe** and **Work Queue** patterns
* Implement **Retry Mechanisms**
* Configure **Dead-Letter Queues (DLQ)**
* Apply **Domain-Driven Design (DDD)**
* Implement **Domain Events and Event Handlers**
* Understand **Saga Choreography**
* Implement **Idempotent Event Processing**
* Understand **Bounded Contexts**
* Design distributed systems using **Microservice Architecture**

---

## 🛠️ Technologies Used

* **Java**
* **Spring Boot**
* **Spring Cloud**
* **RabbitMQ**
* **REST API**
* **Maven**
* **Microservices Architecture**
* **Domain-Driven Design (DDD)**
* **Event-Driven Architecture**

---

## 📁 Repository Structure

Each exercise is maintained as a separate program/project to demonstrate a specific microservices or event-driven architecture concept.

```text
SpringbootExercises/
│
├── 01-Basic-Microservice/
├── 02-Customer-Order-Services/
├── 03-Service-Communication/
├── 04-API-Gateway/
├── 05-OrderCreated-Publisher/
├── 06-OrderCreated-Consumer/
├── 07-Publish-Subscribe/
├── 08-Work-Queue/
├── 09-Retry-DLQ/
├── 10-Order-Aggregate/
├── 11-Domain-Event/
├── 12-Event-Handler/
├── 13-Saga-Choreography/
├── 14-Idempotent-Processing/
└── 15-Bounded-Context/
```

---

## 🚀 Purpose

The purpose of this repository is to gain **hands-on experience in designing and developing distributed applications using Spring Boot, Microservices, RabbitMQ, and Domain-Driven Design principles.**
