package MVC;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class productDao {
    @Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	// create
	@Transactional
	public void createProduct(product pro) {
		this.hibernateTemplate.save(pro);
	}
	// get all product
	public List<product> getAll(){
		List<product> products=this.hibernateTemplate.loadAll(product.class);
		return products;
	}
	// delete
	@Transactional
	public void deleteProduct(int pid) {
		product p=this.hibernateTemplate.load(product.class,pid);
		this.hibernateTemplate.delete(p);
	}
	// get single object
	
	public product getProduct(int pid) {
		return this.hibernateTemplate.get(product.class, pid);
	}
	
	
	
	
	
}
