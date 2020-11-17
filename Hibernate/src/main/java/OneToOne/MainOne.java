package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MainOne {
public static void main(String[] args) {
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
EmpOne e1=new EmpOne();
e1.setId(101);e1.setName("albert");e1.setCity("melbern");
EmpOne e2=new EmpOne();
e2.setId(102);e2.setName("newton");e2.setCity("london");
SalaryOne s1=new SalaryOne();
s1.setId(1);s1.setSalary(10000);
SalaryOne s2=new SalaryOne();
s2.setId(2); s2.setSalary(50000);
e1.setSal(s1); e2.setSal(s2);
Session session=factory.openSession();
Transaction tx=session.beginTransaction();
session.save(e1);session.save(e2);session.save(s1);session.save(s2);
tx.commit();
session.close();
factory.close();
}}
