package SpringJDBC;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
/* DriverManagerDataSouce in Spring Spring provides many ways to establish 
connection to a database and perform operations such as retrieval of records */
/* Spring JdbcTemplate is a powerful mechanism to connect to the database and
execute SQL queries 
Spring obtains a connection to the database through a DataSource*/
/* 
 Spring @Configuration annotation is part of the spring core framework. 
 Spring Configuration annotation indicates
 that the class has @Bean definition methods. So Spring container can process 
 the class and generate Spring Beans to be used in the application.
 */
/*
 @Bean is a method-level annotation and a direct analog of the XML <bean/> 
 
 */

@Configuration
public class ConnectionWithoutXml {
	
	@Bean("ds")
public DataSource getDataSource() {
	DriverManagerDataSource ds=new DriverManagerDataSource();
    ds.setDriverClassName("com.mysql.jdbc.Driver");
    ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
    ds.setUsername("root");
    ds.setPassword("1234");
    return ds;
}
	@Bean("jdbcTemplate1")
public JdbcTemplate jdbcTemplate() {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(getDataSource());
	return template;
	
}
	@Bean("Dao")
public DaoInterface getDao() {
	StudentDao studentDao=new StudentDao();
	studentDao.setJdbcTemplate(jdbcTemplate());
	return studentDao;
}




}
