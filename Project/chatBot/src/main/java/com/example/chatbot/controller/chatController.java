package com.example.chatbot.controller;

import com.example.chatbot.model.chatRequest;
import com.example.chatbot.model.chatResponse;
import com.example.chatbot.service.chatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class chatController {

    private final chatService chatService;

    public chatController(chatService chatService) {
        this.chatService = chatService;
    }

    // Health check endpoint
    @GetMapping("/ping")
    public String ping() {
        return "Chatbot is running!";
    }

    // Chat endpoint
    @PostMapping
    public chatResponse chat(@RequestBody chatRequest request) {
        String reply = chatService.getReply(request.getMessage());
        return new chatResponse(reply);
    }
}
