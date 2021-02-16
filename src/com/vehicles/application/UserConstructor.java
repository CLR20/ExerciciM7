package com.vehicles.application;

import com.vehicles.domain.*;
import com.vehicles.project.*;
import com.vehicles.application.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UserConstructor {
	
	private static String user;
	private static String addVehicle;
	private static String firstName;
	private static String lastName;
	private static String birthDate;
	private static String licenseType;
	private static String licenseExp;
	private static String hasInsurance;
	private static String hasParking;
	protected static List people = new ArrayList();
	protected static int totalPeople = 0; 
	
	public UserConstructor (String user, String addVehicle) {
		
		this.user = user;
		this.addVehicle = addVehicle;
	}	
		
	public void OwnerConstruction(String addVehicle) {
		
		if (addVehicle.equals("first")) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your first name: ");
			firstName = sc.nextLine();
			
			System.out.println("Enter your last name: ");
			lastName = sc.nextLine();		
			
			System.out.println("Enter your birth date: ");
			birthDate = sc.nextLine();	
			
			Person person = new Person (firstName, lastName, birthDate);
		}
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your license type (exemple: A - B1): ");
		licenseType = sc.nextLine();
		
		System.out.println("Enter your license expiration date: ");
		licenseExp = sc.nextLine();
		
		License license = new License (licenseType, licenseExp);		
			
		System.out.println("Do you have an insurance (yes / no): ");
		hasInsurance = sc.nextLine();
		
		System.out.println("Do you have a parking (yes / no): ");
		hasParking = sc.nextLine();
		
		Owner owner = new Owner (firstName, lastName, birthDate);
		owner.OwnershipData(hasInsurance, hasParking);
		
		System.out.println(owner);	
		
		String completName = firstName + " " + lastName;
		
		if (! people.contains("%completName%")) {
			totalPeople++;
		}
			
		people.add("'OWNER: " + completName + ", License type: " + licenseType + "'");
		
		sc = new Scanner (System.in);
		System.out.println("\nWill you be a driver (y / n)?: ");
	    String driver = sc.nextLine();
	    
	    if (driver.equals("y")) {
	    	people.add("'DRIVER: " + completName + ", License type: " + licenseType + "'");
	    }
	}
	
	public void DriverConstruction() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the driver's first name: ");
		firstName = sc.nextLine();
		
		System.out.println("Enter the driver's last name: ");
		lastName = sc.nextLine();		
		
		System.out.println("Enter the driver's birth date: ");
		birthDate = sc.nextLine();	
		
		Person person = new Person (firstName, lastName, birthDate);
		
		System.out.println("Enter the driver's license type (exemple: B or B1): ");
		licenseType = sc.nextLine();
		
		System.out.println("Enter the driver's license expiration date: ");
		licenseExp = sc.nextLine();
		
		License license = new License (licenseType, licenseExp);
				
		Driver driver = new Driver (firstName, lastName, birthDate);
		
		System.out.println(driver);	
		
		String completName = firstName + " " + lastName;
		
		if (! people.contains("%completName%")) {
			totalPeople++;
		}
		people.add("'DRIVER: " + completName + ", License type: " + licenseType + "'");
		
	}

	public String getLicenseType () {
		return licenseType;
	}

	public int getUsers () {
		return totalPeople;
	}
	
	public String getDrivers () {
		return people.toString();
	}
}
