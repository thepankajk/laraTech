package SimpleConfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*1st level cache is default cache.//cache memory stored the data for same id
for 2nd level cache i have need to make ehcache maven & hibernate cache maven
in pom.xml file & than we can use more than one cache.
make enable second level cache in config.xml file.
use @Cacheable & @Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
*/
/*fetch(get & load(LAZY/EAGER->default-Lazy Loading) 
Declare at:-> @OneToOne/@OneToMany/@ManyToMany(fetch = FetchType.LAZY/EAGER)
get & load use by session
get:- if data not found in cache or database return null,use if not sure 
get:- get hits always cache/database.
	
load:- if data not found in cache or database return ObjectNotFoundException
use load if sure data is in cache/database.
load:-load returns proxy object if hits the databases,returns full data if 
hits id's or method specifically, it's increase the performance.
*/

public class CacheFatching {
public static void main(String[] args) {
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
Session session=factory.openSession();
Student st1=(Student)session.get(Student.class, 101);
System.out.println(st1.getBranch()+":"+st1.getCollege());
Student st2=(Student)session.load(Student.class, 102);
System.out.println(st2.getId()+":"+st2.getName());	
session.close();
Session session1=factory.openSession();
Student st3=(Student)session1.load(Student.class, 102);
System.out.println(st3.getBranch()+":"+st3.getCollege());
session1.close();
factory.close();
}

}
