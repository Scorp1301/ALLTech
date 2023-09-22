package model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	String street;
	String city;
	int zipCode;
	/**
	 * @param street
	 * @param city
	 * @param zipCode
	 */
	public Address(String street, String city, int zipCode) {
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}
	public Address() {
		
	}
	/**
	 * @param i 
	 * @param string2 
	 * @param string 
	 * 
	 */
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
		
	
	

}