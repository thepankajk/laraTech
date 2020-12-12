package MVC;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class Dao {
@Autowired
private HibernateTemplate hibernateTemplate;

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}

@Transactional
public int saveData(User user) {
Integer i=(Integer)this.hibernateTemplate.save(user);
return i;
}
}
