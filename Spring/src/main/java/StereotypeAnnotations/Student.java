package StereotypeAnnotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob1") // for default we can take ob1 or any other object
@Scope("prototype") // we can use singleton/global/global session/request
public class Student {
@Value("Durgesh")	
private String studentName;
@Value("Lucknow")
private String city;
@Value("#{id1}")  // temp is name of bean
private List<String>address;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}

}
