package springCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod 
{
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("springCore/config.xml");
        StudentPrimitiveData student1=(StudentPrimitiveData) context.getBean("student1");
        StudentPrimitiveData student2=(StudentPrimitiveData)context.getBean("student2");
        System.out.println(student1);
        System.out.println(student2);
        
        StudentCollectionData student3=(StudentCollectionData)context.getBean("student3");
        System.out.println("Student Name:-"+student3.getName());
        System.out.println("Student Address:-"+student3.getAddress());
        System.out.println("Student Phones:-"+student3.getPhones());
        System.out.println("Student Cources:-"+student3.getCources());
        
        pojoRefA temp=(pojoRefA) context.getBean("aref");
        System.out.println("value of x:-"+temp.getX());
        System.out.println("value of y:-"+temp.getOb().getY());
        
        pojoConstructor person=(pojoConstructor)context.getBean("person");
        System.out.println("for constructor injection:-"+person);
    }
}
