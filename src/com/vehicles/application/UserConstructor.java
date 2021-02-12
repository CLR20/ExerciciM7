package com.vehicles.application;

import com.vehicles.domain.*;
import com.vehicles.project.*;
import com.vehicles.application.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UserConstructor {
	
	private static String user;
	private static String firstName;
	private static String lastName;
	private static String birthDate;
	private static Owner owner;
	private static Driver driver;
	private static String licenseType;
	private static String licenseExp;
	private static String hasInsurance;
	private static String hasParking;	
	
	public UserConstructor (String user) {
		
		this.user = user;
	}	
		
	public void OwnerConstruction() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		firstName = sc.nextLine();
		
		System.out.println("Enter your last name: ");
		lastName = sc.nextLine();		
		
		System.out.println("Enter your birth date: ");
		birthDate = sc.nextLine();	
		
		Person person = new Person (firstName, lastName, birthDate);
		
		System.out.println("Enter your license type (exemple: B or B1): ");
		licenseType = sc.nextLine();
		
		System.out.println("Enter your license expiration date: ");
		licenseExp = sc.nextLine();
		
		License license = new License (licenseType, licenseExp);		
			
		System.out.println("Do you have an insurance (yes / no): ");
		hasInsurance = sc.nextLine();
		
		System.out.println("Do you have a parking (yes / no): ");
		hasParking = sc.nextLine();
		
		owner = new Owner (firstName, lastName, birthDate);
		owner.OwnershipData(hasInsurance, hasParking);						
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
		driver = new Driver (firstName, lastName, birthDate);

	}
	
	public Owner getOwner() {

		return owner;	
	}
	
	public Driver getDriver() {

		return driver;	
	}

	public String getLicenseType () {
		return licenseType;
	}
	
	
}
