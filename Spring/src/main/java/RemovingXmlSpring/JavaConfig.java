package RemovingXmlSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
//@ComponentScan(basePackages="RemovingXmlSpring") when using @Bean than no need this 
public class JavaConfig {
    @Bean
	public Address getAddress() {
		return new Address();
	}
	
	@Bean(name= {"st1","s1","ad1"}) // we can use bean name or getStudent method 
public Student getStudent() {
	Student student=new Student(getAddress());
	return student;
	
}
	
}
