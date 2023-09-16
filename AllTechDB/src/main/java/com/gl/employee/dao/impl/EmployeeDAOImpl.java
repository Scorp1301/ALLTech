package com.gl.employee.dao.impl;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gl.employee.dao.EmployeeDAO;
import com.gl.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource (DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public void insert(Employee employee) {
		String sql = "INSERT INTO EMPLOYEE (Emp_id, Emp_name, Emp_age, Emp_salary) VALUES (?,?,?,?)";
		
		jdbcTemplate.update(sql, new Object[] {employee.getEmpId(), employee.getName(), employee.getAge(), employee.getSalary()});

	}
	@Override
	public void update(String name, int id) {
		String sql = "update employee set Emp_name = ? where Emp_id = ?";
		jdbcTemplate.update(sql,name, id);
	}
	
	public void read() {
		String sql = "SELECT * FROM Employee";
		List result = jdbcTemplate.queryForList(sql);
		System.out.println(result);

	}
	public void delete(int id) {
		String sql = "delete from employee where Emp_id = ?";
		jdbcTemplate.update(sql,id);
		System.out.println("The record is deleted");
	}

}
