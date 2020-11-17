package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class SalaryOne {
@Id
private int id;
private int salary;
@OneToOne
@JoinColumn
private EmpOne emp1;
public SalaryOne(int id, int salary, EmpOne emp1) {
	super();
	this.id = id;
	this.salary = salary;
	this.emp1 = emp1;
}
public SalaryOne() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public EmpOne getEmp1() {
	return emp1;
}
public void setEmp1(EmpOne emp1) {
	this.emp1 = emp1;
}

}
