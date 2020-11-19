package az.maqa.spring.apachekafka.components;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics = "kafka-topic", groupId = "group-id")
    public void listenMessage(String message) {
        System.out.println("Message: " + message);
    }
}
