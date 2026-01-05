package com.codingshuttle.yash.module1Introduction;

import org.springframework.stereotype.Component;

@Component
public interface NotificationService {

    void send(String message);
}
