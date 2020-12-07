package SpringStandaloneApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import AutowiredXml.Emp;

public class MainMethod {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("SpringStandaloneApplication/cfg.xml");
    Person id2=(Person)context.getBean("id2");
    System.out.println(id2);
	}
	}


