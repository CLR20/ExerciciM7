package com.vehicles.domain;

import com.vehicles.project.*;

public class Person {
	
	protected static String firstName;
	protected static String lastName;
	protected static String birthDate;
	
	public Person (String firstName, String lastName, String birthDate) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;		
	}
	
	public static String getName () {
		return lastName + ", " + firstName;
	}	
	
	@Override
	public String toString () {
		return "\nPERSONAL DATA: \nName: " + firstName + "\nLast name: " + lastName 
				+ "\nBirth date: " + birthDate + "\nLICENSE: " + License.getLicense();
	}

}
