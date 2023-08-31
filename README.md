# ApacheKafka_project

Follow these documentation to download Apache kafka: https://kafka.apache.org/quickstart
## Components
**KafkaTopicConfig:** Defines Kafka topics to be used for message communication.
Configuration class that defines Kafka topics to be used for message communication. Topics can be configured with various properties, such as the number of partitions and replication factor.

**KafkaProducerConfig:** Configures the Kafka producer to send messages to a topic. 
Configuration class that sets up the Kafka producer. It defines properties like the bootstrap servers and serializers to send messages to a Kafka topic.

**KafkaConsumerConfig:** Configures the Kafka consumer to subscribe to a topic and it receives message from it.
Configuration class that sets up the Kafka consumer. It defines properties like the bootstrap servers and deserializers to consume messages from a Kafka topic.

**MessageController:** Provides a REST API endpoint for sending messages to Kafka.
A Spring MVC controller that exposes a REST API endpoint to send messages to a Kafka topic. It uses the Kafka producer to publish messages.

**KafkaListener:** 
A Kafka listener component that listens to a specified Kafka topic for incoming messages. When a message is received, it triggers the listener's method to process the message.

## Steps to setup & run:
1. Follow these documentation to download Apache kafka: https://kafka.apache.org/quickstart
2. Go to downloaded kafka folder on terminal and run each command on new terminal:
 #### Start the ZooKeeper service
$ bin/zookeeper-server-start.sh config/zookeeper.properties
 #### Start the Kafka broker service
$ bin/kafka-server-start.sh config/server.properties
 #### Consumer
$ bin/kafka-console-consumer.sh --topic Ajay_message --from-beginning --bootstrap-server localhost:9090

4. I used POSTMAN to send message through API:
   ![image](https://github.com/ajayrao004/ApacheKafkaproject/assets/99999518/76b99f5b-ebd5-4453-bad5-03bf81ced4a2)
5. On Consumer terminal you will see the message:
   ![image](https://github.com/ajayrao004/ApacheKafkaproject/assets/99999518/3e8cd132-5662-44dd-b5e5-8062936bfb17)
