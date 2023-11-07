package com.demo.kafka.rest.restkafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.kafka.rest.restkafkademo.service.Producer;


@RestController
@RequestMapping("/kafka/api")
public class RestKafkaController {
	
	@Autowired
	Producer producer;
	
	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String message)
	{
		producer.sendMsgToTopic(message);
		
	}

}
