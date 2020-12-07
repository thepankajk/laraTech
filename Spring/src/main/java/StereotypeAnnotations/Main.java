package StereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringStandaloneApplication.Person;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("StereotypeAnnotation/cfg.xml");
	    Student id2=(Student)context.getBean("id2");
	    System.out.println(id2);
		}
	}


