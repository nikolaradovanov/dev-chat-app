package com.javatechie.spring.ws.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

public class ChatMessage {

	private Long id;
	private String content;
	private String sender;
	private MessageType type;
	private String dateTime;

	public enum MessageType {
		CHAT, LEAVE, JOIN
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

}
