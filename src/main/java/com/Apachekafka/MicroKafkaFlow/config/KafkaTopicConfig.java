package com.Apachekafka.MicroKafkaFlow.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	public NewTopic kafkaTopic() {
		return TopicBuilder.name("Ajay_message")
				.build();
	}

}
