package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "course_id", nullable = false)
	private int course_id;
	private String course_name;
	private double fee;
	
	public Course() {
		
	}

	/**
	 * @param course_id
	 * @param course_name
	 * @param fee
	 */
	public Course(int course_id, String course_name, double fee) {
		this.course_id = course_id;
		this.course_name = course_name;
		this.fee = fee;
	}
	

}
