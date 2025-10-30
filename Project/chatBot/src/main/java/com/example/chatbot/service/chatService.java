package com.example.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class chatService {

    public String getReply(String message) {
        // Simple logic – you can later integrate OpenAI or any AI main.com.example.chatbot.controller.com.example.chatbot.model here
        if (message.toLowerCase().contains("hello")) {
            return "Hi there! How can I help you today?";
        } else if (message.toLowerCase().contains("bye")) {
            return "Goodbye! Have a nice day!";
        } else {
            return "I'm still learning, but I heard: " + message;
        }
    }
}