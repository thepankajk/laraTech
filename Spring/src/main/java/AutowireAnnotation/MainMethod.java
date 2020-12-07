package AutowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

	public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("AutowireAnnotation/config.xml");
     Emp e1=(Emp)context.getBean("e1");
     System.out.println(e1);
	}

}
