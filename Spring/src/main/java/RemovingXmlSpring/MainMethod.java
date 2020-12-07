package RemovingXmlSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainMethod {

public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
	Student student=(Student)context.getBean("getStudent");
	//Address address=(Address)context.getBean("firstAd");
	System.out.println(student);
	student.getAddress();
	//System.out.println(address);
	//address.ad();
student.display();
	}



}
