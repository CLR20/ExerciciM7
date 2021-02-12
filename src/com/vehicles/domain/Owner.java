package com.vehicles.domain;

import com.vehicles.project.*;

public class Owner extends Person {
	
	private String hasInsurance;
	private String hasParking;
	
	public Owner (String firstName, String lastName, String birthDate) {
		super (firstName, lastName, birthDate);
	}
	
	public void OwnershipData (String hasInsurance, String hasParking) {
		
		this.hasInsurance = hasInsurance;
		this.hasParking = hasParking;
	}
	
	@Override
	public String toString () {
		return "\nYOUR DATA: \nName: " + firstName + "\nLast name: " + lastName 
				+ "\nBirth date: " + birthDate + "\nYOUR LICENSE: " + License.getLicense()
				+ "\nYOUR INSURANCE DATA: \nYou have insurance: " + hasInsurance
				+ "\nYou have parking: " + hasParking;
	}

}
