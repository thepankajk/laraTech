package SimpleConfig;

import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL {
public static void main(String[] args) {
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
Session session=factory.openSession();
Transaction tx=session.beginTransaction();
// CURD Operations

// Query q1=session.createQuery("from Student where id=102");
//List<Student> list1=q1.list();
//for(Student s1:list1) {
//System.out.println(s1.getId()+":"+s1.getName()+":"+s1.getCollege());
//Query q2=session.createQuery("update Student set branch=:b1 where id=:i1");
//q2.setParameter("b1", "mechanical");
//q2.setParameter("i1", 102);
//q2.setParameter("b1", "aironotics");
//q2.setParameter("i1", 101);
//int i1=q2.executeUpdate();
//tx.commit();
//System.out.println("total updated id: "+i1);
//Query q3=session.createQuery("delete from Student s where s.id=:i3");
//q3.setParameter("i3", 102);
//int delete=q3.executeUpdate();	
//tx.commit();
//System.out.println("total no of deletion: "+delete);
//Query q6=session.createQuery("select s.id,s.name,s.branch,s.college,a.pin,a.city,"
//		+ "a.state from Student"
//		+ " as s RIGHT OUTER JOIN Address as a on s.id=a.pin");

//List<Object[]> list6=q6.getResultList();
//for(Object[] obj:list6) {
//System.out.println(Arrays.toString(obj));

//page nation

Query q7=session.createQuery("from Student");
q7.setFirstResult(0);
q7.setMaxResults(2);
List<Student> list7=q7.list();
for(Student s7:list7) {
	System.out.println(s7.getId()+":"+s7.getName()+":"+s7.getBranch()+":"+s7.getCollege());
}



}}

