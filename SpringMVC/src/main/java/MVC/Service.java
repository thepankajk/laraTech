package MVC;

import org.springframework.beans.factory.annotation.Autowired;
public class Service {
@Autowired
private Dao dao;
public int createUser(User user) {
	return this.dao.saveData(user);
}
}
