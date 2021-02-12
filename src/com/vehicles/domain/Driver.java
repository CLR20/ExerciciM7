package com.vehicles.domain;

import com.vehicles.project.*;

public class Driver extends Person {
	
	public Driver (String firstName, String lastName, String birthDate) {
		super (firstName, lastName, birthDate);
	}
	
	@Override
	public String toString () {
		return "\nDRIVER DATA: \n\tName: " + firstName + "\n\tLast name: " + lastName 
				+ "\n\tBirth date: " + birthDate + "\nDRIVER LICENSE: \t" + License.getLicense();
	}

}
