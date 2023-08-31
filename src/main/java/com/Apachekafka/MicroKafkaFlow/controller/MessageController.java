package com.Apachekafka.MicroKafkaFlow.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Apachekafka.MicroKafkaFlow.model.MessageRequest;

@RestController
@RequestMapping("api/v1/message")
public class MessageController {
	private KafkaTemplate<String,String> kafkaTemplate;

	public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@PostMapping("/publish")
	public String publish(@RequestBody MessageRequest request)
	{
		kafkaTemplate.send("Ajay_message",request.getMessage());
		return " The message sent consumer";
	}

}
