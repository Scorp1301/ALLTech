package org.al.dao;

import java.util.List;

import javax.sql.DataSource;

import org.al.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImp implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	
	public StudentDaoImp(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}

	@Override
	public int create(Student student) {
		String query = "insert into student(id,name,email,course) values (?,?,?,?)";
		
		try {
			int counter = jdbcTemplate.update(query, new Object[] {student.getId(), student.getName(), student.getEmail(), student.getCourse()});
			return counter;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public List<Student> read() {
		
	}

	@Override
	public int update(Student student) {
		String query = "update student set id = ?, name = ? , email = ?, course = ? ";
		int counter = jdbcTemplate.update(query,new Object[] { student.getId(), student.getName(), student.getEmail(), student.getCourse() });
		return counter;
	}

	@Override
	public int delete(int studentid) {
		String query = "delete from student where id = ?";
		
		int counter = jdbcTemplate.update(query, new Object[] { studentid});
		return counter;
	}
	
	

}
