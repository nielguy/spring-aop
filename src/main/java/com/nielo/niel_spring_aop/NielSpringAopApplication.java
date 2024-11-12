package com.nielo.niel_spring_aop;

import com.nielo.niel_spring_aop.service.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class NielSpringAopApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(NielSpringAopApplication.class, args);
		PaymentService payment = context.getBean(PaymentService.class);
		payment.makePayment();
		context.close();
	}

}
