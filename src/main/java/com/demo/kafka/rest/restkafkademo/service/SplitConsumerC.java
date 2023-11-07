package com.demo.kafka.rest.restkafkademo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.demo.kafka.rest.restkafkademo.controller.ValueCController;




@Component
public class SplitConsumerC {

	@Autowired
	private ValueCController valueCController;
	
	@KafkaListener(topics = "Split_Topic_C", groupId = "group_id_C")
	  public void consume(String message) {
		processMessageFromSplitTopicC(message);
		 }
	
	 private void processMessageFromSplitTopicC(String message) {
	        // Implement your logic to process the message from Split_Topic_D
	        System.out.println("Received from Consumer C: " + message);

	        // Set the message in the shared variable
	        valueCController.setMessage(message);
	    }
	 
    
   

}
