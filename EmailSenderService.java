package com.arjuncodes.springemaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String to,
                                String subject,
                                String message1
    ) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("madhurpatel38@gmail.com");
        message.setTo(to);
        message.setText(message1);
        message.setSubject(subject);
        mailSender.send(message);
        System.out.println("Mail Send...");


    }

    }

