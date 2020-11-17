package OneToOne;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class EmpOne {
@Id
private int id;
private String name;
private String city;
@OneToOne
private SalaryOne sal;
public EmpOne(int id, String name, String city, SalaryOne sal) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.sal = sal;
}
public EmpOne() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public SalaryOne getSal() {
	return sal;
}
public void setSal(SalaryOne sal) {
	this.sal = sal;
}


}
