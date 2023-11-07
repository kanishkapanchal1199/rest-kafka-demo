package com.demo.kafka.rest.restkafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.demo.kafka.rest.restkafkademo.controller.ValueAController;





@Component
public class SplitConsumerA {
	
	@Autowired
	private ValueAController valueAController;

	@KafkaListener(topics = "Split_Topic_A", groupId = "group_id_A")
	public void consume(String message) {
		System.out.println("Kafka Consume Method message ::"+message);
		  processMessageFromSplitTopicA(message); }

    private void processMessageFromSplitTopicA(String message) {
        // Implement your logic to process the message from Split_Topic_A
        System.out.println("Received from Consumer A: " + message);
        // Send the processed message to REST API A
        valueAController.setMessage(message);
    }

	
	  
	 
	
	
	
}
