package RemovingXmlSpring;

import org.springframework.stereotype.Component;

// @Component

public class Student {
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Student(Address address) {
	super();
	this.address = address;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public void display() {
	System.out.println("i am from student class");
	this.address.ad();
}

}

