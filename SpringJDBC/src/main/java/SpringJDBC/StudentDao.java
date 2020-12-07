package SpringJDBC;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao implements DaoInterface{
private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	public int insert(StudentPOJO student) {
	String query="insert into student (id,name,city) values(?,?,?)";
	int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
	return r;
	}

	public int change(StudentPOJO student) {
    String query="update student set name=?,city=? where id=?";
	int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
	return r;
	}

	public int delete(int studentId) {
	String query="delete from student where id=?";
	int r=this.jdbcTemplate.update(query, studentId);
		return r;
	}

	public StudentPOJO display(int studentId) {
		String query="select * from student where id=?";
		RowMapper <StudentPOJO> rowMapper=new RowMapperImp();
		StudentPOJO student=this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
			return student;
	}

	public List<StudentPOJO> getAllStudent() {
    String query="select * from student";
	List<StudentPOJO> students=this.jdbcTemplate.query(query,new RowMapperImp());	
		
		return students;
	}


}
