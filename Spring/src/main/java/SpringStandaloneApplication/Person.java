package SpringStandaloneApplication;

import java.util.*;

public class Person {
private List<String> friends;
// same can use Map,Properties

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

public Person(List<String> friends) {
	super();
	this.friends = friends;
}

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Person [friends=" + friends + "]";
}

}
