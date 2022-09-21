package com.javatechie.spring.ws.api.controller;

import com.javatechie.spring.ws.api.services.ChatMessageService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.javatechie.spring.ws.api.model.ChatMessage;

@Controller
public class ChatController {

	private final ChatMessageService chatMessageService;

	public ChatController(ChatMessageService chatMessageService) {
		this.chatMessageService = chatMessageService;
	}

	@MessageMapping("/chat.register")
	@SendTo("/topic/public")
	public ChatMessage register(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {

		chatMessageService.save(chatMessage);

		System.out.println(chatMessageService.findAll().size());

		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		return chatMessage;
	}

	@MessageMapping("/chat.send")
	@SendTo("/topic/public")
	public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {


		chatMessageService.save(chatMessage);

		for (ChatMessage i : chatMessageService.findAll()) {
			System.out.println(i.getSender() + " : " + i.getContent());
		}

		return chatMessage;
	}

}
