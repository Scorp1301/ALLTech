package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "passport_number")
	private String passportNumber;
	
	@OneToOne(mappedBy = "passport")
	private Customer customer;
	
	public Passport() {}

	/**
	 * @param passportNumber
	 */
	public Passport(String passportNumber) {
		this.passportNumber = passportNumber;
	
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	

}
