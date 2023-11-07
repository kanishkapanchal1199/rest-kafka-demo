package com.demo.kafka.rest.restkafkademo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.demo.kafka.rest.restkafkademo.controller.ValueBController;





@Component
public class SplitConsumerB {
	@Autowired
	private ValueBController valueBController;
	
	@KafkaListener(topics = "Split_Topic_B", groupId = "group_id_B")
	public void consume(String message) {
	processMessageFromSplitTopicB(message);
}
	
    private void processMessageFromSplitTopicB(String message) {
        // Implement your logic to process the message from Split_Topic_A
        System.out.println("Received from Consumer B: " + message);
        // Send the processed message to REST API A
        valueBController.setMessage(message);
    }
	


}
