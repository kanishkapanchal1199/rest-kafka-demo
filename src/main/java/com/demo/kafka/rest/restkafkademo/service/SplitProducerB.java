package com.demo.kafka.rest.restkafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SplitProducerB {
	 @Autowired
	    private KafkaTemplate<String, String> kafkaTemplate;
	    
	    public void sendSplitCharsToTopic(char c) {
	       
	            kafkaTemplate.send("Split_Topic_B", String.valueOf(c));
	        
	    }

}
