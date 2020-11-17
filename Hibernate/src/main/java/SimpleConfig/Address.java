package SimpleConfig;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
@Id
private int pin;
private String city;
private String state;
public Address(int pin, String city, String state) {
	super();
	this.pin = pin;
	this.city = city;
	this.state = state;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
}
