package az.maqa.spring.apachekafka.controller;

import az.maqa.spring.apachekafka.components.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private Publisher publisher;

    @PostMapping("/message")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        publisher.produceMessage(message);
        return ResponseEntity.ok("Message send.");
    }

}