package com.demo.kafka.rest.restkafkademo.controller;


import java.util.concurrent.atomic.AtomicReference;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi")
@Component
public class ValueBController {
	 private final AtomicReference<String> messageHolder = new AtomicReference<>();

	    public void setMessage(String message) {
	        messageHolder.set(message);
	    }

	    public String getMessage() {
	        return messageHolder.get();
	    }

	    @PostMapping("/b")
	    public ResponseEntity<String> processMessage() {
	        // Retrieve the message from the shared variable
	        String message = getMessage();
	        if (message != null) {
	            // Implement your logic to process the received message
	            System.out.println("Received message from Kafka: " + message);
	            // Process the message as needed
	            // Return a response if necessary
	            return ResponseEntity.ok("Message processed successfully :: " +message);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }


}
