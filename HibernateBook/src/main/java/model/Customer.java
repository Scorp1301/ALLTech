package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	@OneToOne(cascade = {CascadeType.PERSIST})
	private Passport passport;
	
	public  Customer() {
		
	}

	/**
	 * @param name
	 * @param passport
	 */
	public Customer(String name, Passport passport) {
		super();
		this.name = name;
		this.passport = passport;
	}
	public Passport getPassport() {
		return passport;
	}
	

}
