package com.demo.kafka.rest.restkafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics="Main_Topic",groupId = "first_group")
	public void listenToTopic(String recievedMessage)
	{
		System.out.println("The Message is recieved ::"+recievedMessage);
	}
}
