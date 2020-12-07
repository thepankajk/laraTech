package SpringORM;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
private int studentId;
private String studentName;
private String studentCity;
public Students(int studentId, String studentName, String studentCity) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentCity = studentCity;
}
public Students() {
	super();
	// TODO Auto-generated constructor stub
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
@Override
public String toString() {
	return "Students [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity + "]";
}


}
