package com.arjuncodes.springemaildemo;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailDemoApplication.class, args);
	}

	@Autowired
	private EmailSenderService senderService;

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		senderService.sendEmail("madhpatel123@gmail.com","From Backend","This is message body from backend");

	}

}
