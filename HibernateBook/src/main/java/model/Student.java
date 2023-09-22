package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "Stu_id", nullable = false)
	private long stu_id;
	
	private String stu_name;
	private int year;
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "course_id")
	private Course course;
	
	public Student() {}

	/**
	 * @param id                     
	 * @param stu_id
	 * @param stu_name
	 * @param year
	 */
	public Student(long stu_id, String stu_name, int year, Course course) {
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.year = year;
	}
	
	

}
