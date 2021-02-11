package com.vehicles.project;

import com.vehicles.project.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main { 

    static List <Wheel> backwheels = new ArrayList <Wheel>();
    static List <Wheel> frontwheels = new ArrayList <Wheel>();

    public static void main (String [] args) {

    	String vehicle;
    	do {
    		Scanner scVehicle = new Scanner(System.in);    	
	        System.out.println("Enter your vehicle's type (Car or Bike): ");
	        vehicle = scVehicle.nextLine();
	        if (! vehicle.equals("Car") && ! vehicle.equals("Bike")) {
	        	System.out.println("Invalid answer. Start again.");
	        	continue;
	        }
	        else 
	        	break; 
        } while (! vehicle.equals("Car") || ! vehicle.equals("Bike"));
        
        String plate;           
        do {
        	Scanner scPlate = new Scanner(System.in);
            System.out.println("Enter your vehicle's plate: ");
            plate = scPlate.nextLine();
            if (! plate.matches("\\d{4}" + "[A-Z]{2,3}")) {
            	System.out.println("The plate is not valid. It must follow the style 1111AA or 1111AAA");
            	continue;
            } else
            	break;
        	
        } while (! plate.matches("\\d{4}" + "[A-Z]{2,3}"));
        
        Scanner scBrand = new Scanner(System.in);
        System.out.println("Enter your vehicle's brand: ");
        String brand = scBrand.nextLine();

        Scanner scColor = new Scanner(System.in);
        System.out.println("Enter your vehicle's color: ");
        String color = scColor.nextLine();
        
        Scanner scWheelBrand = new Scanner (System.in);
        System.out.println("Enter your back wheel's brand: ");
        String backWheelBrand = scWheelBrand.nextLine();
        
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
        
        Wheel backWheel= new Wheel(backWheelBrand,backWheelDtr);
        
        scWheelBrand = new Scanner (System.in);
        System.out.println("Enter your front wheel's brand: ");
        String frontWheelBrand = scWheelBrand.nextLine();

        Double frontWheelDtr;
        do {
        	Scanner scWheelDtr = new Scanner (System.in);        	  
	        System.out.println("Enter your front wheel's diameter: ");
	        frontWheelDtr = scWheelDtr.nextDouble();
	        if (0.4 > frontWheelDtr || frontWheelDtr > 4) {
	        	System.out.println("The diameter is not valid. Must be between 0.4 and 4");
	        	continue;
	        } else
	        	break;        
        } while (0.4 > frontWheelDtr || frontWheelDtr > 4);
        
        Wheel frontWheel= new Wheel(frontWheelBrand,frontWheelDtr);
        
        
        if (vehicle.equals("Car")) {
        	
        	Car firstCar = new Car (plate, brand, color);
            
            backwheels.add(backWheel);
            backwheels.add(backWheel);
            
            frontwheels.add(frontWheel);
            frontwheels.add(frontWheel);
             

           try {
                firstCar.addWheels(frontwheels, backwheels);
            } catch (Exception e) {
                e.printStackTrace();
            }
           
           System.out.println(firstCar);

        }
        
        else if (vehicle.equals("Bike")) {
        	
        	Bike firstBike = new Bike (plate, brand, color);
            
            backwheels.add(backWheel);                 
            
            frontwheels.add(frontWheel);
             

           try {
                firstBike.addWheels(frontwheels, backwheels);
            } catch (Exception e) {
                e.printStackTrace();
            }
           
           System.out.println(firstBike);
        }   	
    	  
    }
}
