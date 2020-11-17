package OneToMany;

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
Question q1=new Question();
q1.setQuestionId(101);
q1.setQuestion("what is java");
Answer answer=new Answer();
answer.setAnswerId(501);
answer.setAnswer("java is oopls");
answer.setQuestion(q1);

Answer answer1=new Answer();
answer.setAnswerId(502);
answer.setAnswer("java contains spring");
answer.setQuestion(q1);

Answer answer2=new Answer();
answer.setAnswerId(503);
answer.setAnswer("java contains hibernate");
answer.setQuestion(q1);

List<Answer> list=new ArrayList<Answer>();
list.add(answer);list.add(answer1);list.add(answer2);
q1.setAnswers(list);

Session session=factory.openSession();
Transaction tx=session.beginTransaction();
session.save(q1);
session.save(answer);
session.save(answer1);
session.save(answer2);
tx.commit();
session.close();
factory.close();

}}
