package com.sila.Bebka_Spring.service;


import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessagePrinter messagePrinter;

    public MessageService(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    public void showMessage() {
        messagePrinter.printMessage();
    }
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
