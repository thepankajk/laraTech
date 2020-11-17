package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

public class MainMethod {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Emp e1=new Emp();
	Emp e2=new Emp();
	e1.setEid(201);
	e2.setEid(202);
	e1.setName("albert");
	e2.setName("newton");
	Project p1=new Project();
	Project p2=new Project();
	p1.setPid(501);
	p2.setPid(502);
	p1.setProjectName("Web project");
	p2.setProjectName("Android project");
	
	List<Emp> list1=new ArrayList<Emp>();
	list1.add(e1);list1.add(e2);
	
	List<Project> list2=new ArrayList<Project>();
	list2.add(p1);list2.add(p2);
	e1.setProjects(list2);
	p1.setEmps(list1);
	
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(e1);session.save(e2);
	session.save(p1);session.save(p2);
	tx.commit();
	factory.close();
	session.close();
	}

}
