package com.Apachekafka.MicroKafkaFlow.model;

public class MessageRequest {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageRequest [message=" + message + "]";
	}

}
