package EmbeddingAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MainMethod {
	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Students st1=new Students();
	st1.setId(501);
	st1.setName("albert");
	st1.setCity("new jersey"); 
	Certificate c1=new Certificate();
	c1.setCourse("j2ee");
	c1.setDuration("2 months");
	st1.setCerti(c1);
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(st1);
	tx.commit();
	session.close();
	factory.close();
}}
