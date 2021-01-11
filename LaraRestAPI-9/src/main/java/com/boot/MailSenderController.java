package com.boot;

import java.util.Properties;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSenderController {
private JavaMailSenderImpl getjavaMailSenderImpl() {
	JavaMailSenderImpl mailSender=new JavaMailSenderImpl();
	mailSender.setUsername("pankajkry1@gmail.com");
	mailSender.setPassword("8233911046");
	mailSender.setHost("smtp.gmail.com");
	mailSender.setPort(587);
	Properties props=mailSender.getJavaMailProperties();
	props.put("mail.transport.protocol", "smtp");
	props.put("mail.smtp.auth", true);
	props.put("mail.smtp.starttls.enable", true);
	props.put("mail.smtp.starttls.required", true);
	props.put("mail.smtp.connectiontimeout", 5000);
	props.put("mail.smtp.timeout", 5000);
	props.put("mail.smtp.writetimeout", 5000);
	return mailSender;
	}
@GetMapping("/mail5")
public String mail5() throws Exception {
	
    JavaMailSenderImpl javaMailSender=getjavaMailSenderImpl();
	MimeMessage msg=javaMailSender.createMimeMessage();
	try {
	MimeMessageHelper helper=new MimeMessageHelper(msg,true);
	helper.setTo("thepakajk@gmail.com");
	helper.setSubject("hii i am from spring boot ");
	helper.setText("<h1>hello from spring boot</h1>",true);
	javaMailSender.send(msg);
	System.out.println("mail sent");
	}catch(Exception e) {
		e.printStackTrace();
	}
	return "success";
}
}
