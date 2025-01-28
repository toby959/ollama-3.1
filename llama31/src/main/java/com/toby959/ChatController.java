package com.toby959;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }


    @GetMapping("/broma")
    public String broma() {
        return chatClient.prompt()
                .user("Por favor, cuéntame un chiste de papá sobre computadoras.")
                .call()
                .content();
    }

@GetMapping("")
public String home() {
    return chatClient.prompt()
            .user("Cuéntame un chiste de papá sobre perros.")
            .call()
            .content();
}
}
