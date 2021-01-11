package com.boot;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MailController {
	@Autowired
private JavaMailSender javaMailSender;
	@GetMapping("mail1")
	public String mail() {
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo("phyadav1@gmail.com","phyadav3@gmail.com");
		//msg.setBcc("a@a.com");
		//msg.setCc("b@b.com");
		msg.setSubject("testing from spring boot");
		msg.setText("Hello world SpringBoot email");
		javaMailSender.send(msg);
		return "success";
	}
	@GetMapping("/mail2")
	public String mail2() throws Exception {
		MimeMessage msg=javaMailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(msg);
		helper.setTo("thepakajk@gmail.com");
		helper.setSubject("hii i am from spring boot ");
		helper.setText("<h1>hello from spring boot</h1>");
		javaMailSender.send(msg);
		return "success";
	}
	@GetMapping("/mail3")
	public String mail3() throws Exception {
		MimeMessage msg=javaMailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(msg,true);
		helper.setTo("thepakajk@gmail.com");
		helper.setSubject("hii i am from spring boot ");
		helper.setText("<h1>hello from spring boot</h1>",true);
		javaMailSender.send(msg);
		return "success";
	}
	@GetMapping("/mail4")
	public String mail4() throws Exception {
		MimeMessage msg=javaMailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(msg,true);
		helper.setTo("thepakajk@gmail.com");
		helper.setSubject("hii i am from spring boot ");
		helper.setText("<h1>hello from spring boot</h1>",true);
		helper.addAttachment("myappconfig.properties",new ClassPathResource("application.properties"));
		
		javaMailSender.send(msg);
		return "success";
	}
	
	
}
