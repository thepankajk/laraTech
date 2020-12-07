package SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("SpringORM/config.xml");
Dao dao=(Dao)context.getBean("stDao");
/*Students student=new Students(201,"newton","singapore");
Students student1=new Students(301,"albert","london");
Students student2=new Students(401,"merry","new york");
int r=dao.insert(student);dao.insert(student1);dao.insert(student2);
System.out.println("done..."+r);*/

List<Students> r1=dao.getAll();
for(Students s1:r1) {
	System.out.println(s1);
}


	
	
	}

}
