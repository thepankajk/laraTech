package SimpleConfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SimpleMain {
public static void main(String[] args) {
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
Student st1=new Student();
st1.setId(101);st1.setName("Albert");st1.setBranch("cse");st1.setCollege("st.mary's");
Student st2=new Student();
st2.setId(102);st2.setName("farady");st2.setBranch("ece");st2.setCollege("MIT");
Address ad1=new Address();
ad1.setPin(500076);ad1.setCity("Hyderabad");ad1.setState("Teleangana");
Address ad2=new Address();
ad2.setPin(100001);ad2.setCity("Mussachusets");ad2.setState("Penselvenia");
Session session=factory.openSession();
Transaction tx=session.beginTransaction();
session.save(st1);session.save(st2);session.save(ad1);session.save(ad2);
tx.commit();
session.close();factory.close();

}}
