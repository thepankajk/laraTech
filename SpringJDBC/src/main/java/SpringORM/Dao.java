package SpringORM;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
public class Dao {
private HibernateTemplate hibernateTemplate;

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}
// insert student data
@Transactional
public int insert(Students student) {
	Integer i=(Integer) this.hibernateTemplate.save(student);
	return i;
	}
//fetch student data
public Students getStudent(int studentId) {
	Students student=this.hibernateTemplate.get(Students.class, studentId);
	return student;
}
//fetch all student data
public List<Students> getAll(){
	List<Students> student=this.hibernateTemplate.loadAll(Students.class);
	return student;
}
// delete student data
public void deleteStudent(int studentId) {
Students student=this.hibernateTemplate.get(Students.class, studentId);
this.hibernateTemplate.delete(student);
}

public void updateStudent(Students student) {
this.hibernateTemplate.update(student);
}
}