package com.nielo.niel_spring_aop.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void makePayment() {
        System.out.println("Please wait...");
        System.out.println("Payment successfully completed");
    }
}
