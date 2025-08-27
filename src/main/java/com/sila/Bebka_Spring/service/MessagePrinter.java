package com.sila.Bebka_Spring.service;

import org.springframework.stereotype.Component;

@Component

public class MessagePrinter {
    public void printMessage() {
        System.out.println("Merhaba, Spring IoC Container çalışıyor!");
    }
}


