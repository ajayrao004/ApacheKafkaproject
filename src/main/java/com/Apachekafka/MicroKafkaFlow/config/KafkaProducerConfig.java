package com.Apachekafka.MicroKafkaFlow.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;



@Configuration
public class KafkaProducerConfig {
	@Value("${spring.kafka.bootstrap-servers}")
	private String bootstrapServer;
	
	public Map<String, Object> producerConfig()
	{
		Map<String, Object> m1=new HashMap<>();
		m1.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
		m1.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,StringSerializer.class);
		m1.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class);
		return m1;
	}
	@Bean
	public ProducerFactory<String,String> producerFactory(){
		return new DefaultKafkaProducerFactory<>(producerConfig());
	}
	@Bean
	public KafkaTemplate<String,String> kafkaTemplate(ProducerFactory<String,String> producerFactory){
		return new KafkaTemplate<>(producerFactory);
		
	}

}
