package com.demo.kafka.rest.restkafkademo.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


import com.demo.kafka.rest.restkafkademo.controller.ValueDController;



@Component
public class SplitConsumerD {
    
	@Autowired
	private ValueDController valueDController;

    @KafkaListener(topics = "Split_Topic_D", groupId = "group_id_D")
    public void consume(String message) {
        processMessageFromSplitTopicD(message);
    }

    private void processMessageFromSplitTopicD(String message) {
        // Implement your logic to process the message from Split_Topic_D
        System.out.println("Received from Consumer D: " + message);

        // Set the message in the shared variable
        valueDController.setMessage(message);
    }
}

	 
	 
    



