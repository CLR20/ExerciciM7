package com.vehicles.application;

import com.vehicles.domain.*;
import com.vehicles.project.*;
import com.vehicles.application.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class VehicleConstructor { 

	private static String user;
	private static String addVehicle;
	private static UserConstructor uC;
	private static String vehicle;
	private static String lT;
	private static String plate;
	private static String brand;
	private static String color;
	private static List <Wheel> backWheels = new ArrayList <Wheel>();
	private static List <Wheel> frontWheels = new ArrayList <Wheel>();   
	private static Wheel frontWheel;
	private static Wheel backWheel;
	protected static List vehicles = new ArrayList();

    public VehicleConstructor (String user, String addVehicle) {

    	this.user = user;   
    	this.addVehicle = addVehicle;
    }
    
    public static void VehicleConstruction () throws Exception {
    	
    	uC = new UserConstructor (user, addVehicle);
    	
    	//if (addVehicle.equals("first")) {
    		uC.OwnerConstruction(addVehicle);
    	//}
    	    	    	
    	do {
    		Scanner sc = new Scanner(System.in);    	
	        System.out.println("\nEnter your vehicle's type (Car, Bike or Truck): ");
	        vehicle = sc.nextLine();
	        if (! vehicle.equals("Car") && ! vehicle.equals("Bike") && ! vehicle.equals("Truck")) {
	        	System.out.println("Invalid answer. Start again.");
	        	continue;
	        }
	        else 
	        	break; 
        } while (! vehicle.equals("Car") || ! vehicle.equals("Bike") || ! vehicle.equals("Truck"));
    	    	
    	License.checkLicense();
    	Boolean check = License.getCheck(); 
    	
    	if (check = false) {
    		System.exit(1);
    	}
    	
    	do {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your vehicle's plate: ");
	        plate = sc.nextLine();
	        if (! plate.matches("\\d{4}" + "[A-Z]{2,3}")) {
	        	System.out.println("The plate is not valid. It must follow the style 1111AA or 1111AAA");
	        	continue;
	        } else
	        	break;	    	
	    } while (! plate.matches("\\d{4}" + "[A-Z]{2,3}"));
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your vehicle's brand: ");
	    brand = sc.nextLine();
	
	    System.out.println("Enter your vehicle's color: ");
	    color = sc.nextLine();
	    
	    System.out.println("Enter your back wheel's brand: ");
	    String backWheelBrand = sc.nextLine();
	    
	    Double backWheelDtr;
	    do {
	    	Scanner scWheelDtr = new Scanner (System.in);        	  
	        System.out.println("Enter your back wheel's diameter: ");
	        backWheelDtr = scWheelDtr.nextDouble();
	        if (0.4 > backWheelDtr || backWheelDtr > 4) {
	        	System.out.println("The diameter is not valid. Must be between 0.4 and 4");
	        	continue;
	        } else
	        	break;        
	    } while (0.4 > backWheelDtr || backWheelDtr > 4);
	    
	    backWheel= new Wheel(backWheelBrand,backWheelDtr);
	    
	    System.out.println("Enter your front wheel's brand: ");
	    String frontWheelBrand = sc.nextLine();
	
	    Double frontWheelDtr;
	    do {
	    	sc = new Scanner (System.in);        	  
	        System.out.println("Enter your front wheel's diameter: ");
	        frontWheelDtr = sc.nextDouble();
	        if (0.4 > frontWheelDtr || frontWheelDtr > 4) {
	        	System.out.println("The diameter is not valid. Must be between 0.4 and 4");
	        	continue;
	        } else
	        	break;        
	    } while (0.4 > frontWheelDtr || frontWheelDtr > 4);
	    
	    frontWheel= new Wheel(frontWheelBrand,frontWheelDtr);    
	    
		if (vehicle.equals("Car")) {
			
			makeCar(); 
			
		}
		       
		else if (vehicle.equals("Bike")) {
		        	
		   	makeBike();
		}		
		    
        else if (vehicle.equals("Truck")) {
        	
        	makeTruck();
        }
		
		String driver;
		do {
	        sc = new Scanner (System.in);
			System.out.println("\nDo you want to add drivers (y / n)?: ");
		    driver = sc.nextLine();
		    
		    if (driver.equals("y")) {
		    	user = "Driver";
		    	UserConstructor uC = new UserConstructor(user, addVehicle);
		    	uC.DriverConstruction();
		    	License.checkLicense();
		    	check = License.getCheck(); 
		    	continue;
		    	
		    } else {
		    	System.out.println("That will be all, thank you.");
		    	break;
		    }
		} while (driver.equals("y"));
		
		vehicles.add("VEHICLE: " + vehicle + ", " + plate + ", " + brand + ", " + color
						+ " | " + uC.getDrivers() + "\n");				
    }       
    
    private static void makeCar() {
    	
    	Car car = new Car (plate, brand, color);
        
        backWheels.add(backWheel);
        backWheels.add(backWheel);
        
        frontWheels.add(frontWheel);
        frontWheels.add(frontWheel);
         

       try {
            car.addWheels(frontWheels, backWheels);
        } catch (Exception e) {
            e.printStackTrace();
        }
       
       System.out.println(car); 
       
       backWheels.clear();    
       frontWheels.clear();
       
    }
    
    private static void makeBike() {
    	
    	Bike bike = new Bike (plate, brand, color);
        
        backWheels.add(backWheel);                 
        
        frontWheels.add(frontWheel);
         

       try {
            bike.addWheels(frontWheels, backWheels);
        } catch (Exception e) {
            e.printStackTrace();
        }
       
       System.out.println(bike);

       backWheels.clear();    
       frontWheels.clear();
    }
    
    private static void makeTruck() {
    	
    	Truck truck = new Truck(plate, brand, color);
    	
    	backWheels.add(backWheel);
    	backWheels.add(backWheel);
    	
    	frontWheels.add(frontWheel);
    	frontWheels.add(frontWheel);
    	
    	try {
    		truck.addWheels(frontWheels, backWheels);
    	} catch (Exception e){
    		e.printStackTrace();
    	}
    	
    	System.out.println(truck);

        backWheels.clear();    
        frontWheels.clear();
    }
    
    public static String getVehicle () {
    	return vehicle;
    }
    
    public static String getSummary () {    	
    	return "\nDATA SUMMARY: " + "\nTotal vehicles: " + vehicles.size() + "\nTotal users: "
    			+ uC.getUsers() + "\n" + vehicles;
    }
    
}
