package com.nielo.niel_spring_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.nielo.niel_spring_aop.service.PaymentService.makePayment())")
    private void logPayment() {}

    @Before("execution(* com.nielo.niel_spring_aop.service.PaymentService.makePayment())")
    public void printBefore() {
        System.out.println("Payment started...");
    }

    @Around(value = "logPayment()")
    public void printAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Proceeding towards Payment Gateway");
        try {
            joinPoint.proceed();
        } finally {

        }
        System.out.println("Getting back to home page.  Please do not click");
    }

    @After("execution(* com.nielo.niel_spring_aop.service.PaymentService.makePayment())")
    public void printAfter() {
        System.out.println("Thanks for using our service...");
    }
}
