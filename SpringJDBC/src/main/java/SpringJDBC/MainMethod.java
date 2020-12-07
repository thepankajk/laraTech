package SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainMethod 
{
    public static void main( String[] args )
    {
       // ApplicationContext context=new ClassPathXmlApplicationContext("SpringJDBC/config.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(ConnectionWithoutXml.class);
        DaoInterface template=(DaoInterface)context.getBean("Dao");
        /*StudentPOJO student=new StudentPOJO();
        student.setId(110);student.setName("dyna");student.setCity("london");
        int result= template.insert(student);
        System.out.println("Student details inserted"+result);
        StudentPOJO student=new StudentPOJO();
        student.setId(110);student.setName("bhabha");student.setCity("hyderabad");
        int result1=template.change(student);
        System.out.println("total updated student is:-"+result1);
        
        int result2=template.delete(101);
        System.out.println("total deleted student is:-"+result2);
        
        StudentPOJO student=template.display(110);
        System.out.println(student);*/
        List<StudentPOJO> students=template.getAllStudent();
        for(StudentPOJO s:students) {
        	System.out.println(s);
        }
    }
}
