package SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImp implements RowMapper<StudentPOJO>{

	public StudentPOJO mapRow(ResultSet rs, int rowNum) throws SQLException {
    StudentPOJO student=new StudentPOJO();
    student.setId(rs.getInt(1));
    student.setName(rs.getString(2));
    student.setCity(rs.getString(3));	
		return student;
	}

}
