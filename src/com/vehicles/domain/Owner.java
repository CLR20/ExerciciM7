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
		return "\nYOUR DATA: \n\tName: " + firstName + "\n\tLast name: " + lastName 
				+ "\n\tBirth date: " + birthDate + "\nYOUR LICENSE: " + License.getLicense()
				+ "\nYOUR INSURANCE DATA: \n\tYou have insurance: " + hasInsurance
				+ "\n\tYou have parking: " + hasParking;
	}

}
