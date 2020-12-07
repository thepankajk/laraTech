package SpringJDBC;

import java.util.List;

public interface DaoInterface {
public int insert(StudentPOJO student);
public int change(StudentPOJO student);
public int delete(int studentId);
public StudentPOJO display(int studentId);
public List<StudentPOJO>getAllStudent();
}
