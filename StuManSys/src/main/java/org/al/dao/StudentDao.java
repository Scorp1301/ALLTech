package org.al.dao;

import java.util.List;

import org.al.model.Student;

public interface StudentDao {
	public int create(Student student);
	
	public List<Student> read();
	
	public int update(Student student);
	
	public int delete(int studentid);

}
