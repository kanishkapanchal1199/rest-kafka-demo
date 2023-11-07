package com.demo.kafka.rest.restkafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	
	/*
	 * @Autowired KafkaTemplate<String, String> kafkaTemplate;
	 * 
	 * public void sendMsgToTopic(String message) { kafkaTemplate.send("Main_Topic",
	 * message); }
	 */	
	
	
	 	@Autowired
	    private SplitProducerA splitProducerA;
	    
	    @Autowired
	    private SplitProducerB splitProducerB;
	    
	    @Autowired
	    private SplitProducerC splitProducerC;
	    
	    @Autowired
	    private SplitProducerD splitProducerD;
	    
	    public void sendMsgToTopic(String message) {
	        char[] characters = message.toCharArray();
	      
	        	
	        	splitProducerA.sendSplitCharsToTopic(characters[0]);
	        	splitProducerB.sendSplitCharsToTopic(characters[1]);
	        	splitProducerC.sendSplitCharsToTopic(characters[2]);
	        	splitProducerD.sendSplitCharsToTopic(characters[3]);
	        }
	    
}
