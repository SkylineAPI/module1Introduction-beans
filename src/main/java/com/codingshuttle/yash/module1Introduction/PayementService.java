package com.codingshuttle.yash.module1Introduction;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class PayementService {
    public void pay(){
        System.out.println("....Paying....");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Before Paying....");
    }

    @PreDestroy
    public void beforeDestroy(){
        System.out.println("After Payment....");
    }
}
