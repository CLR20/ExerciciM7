package com.vehicles.project;

import com.vehicles.application.*;
import com.vehicles.project.*;
import com.vehicles.domain.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main { 

    public static void main (String [] args) {

    	Scanner sc = new Scanner(System.in);
        System.out.println("Are you the vehicle's owner (y/n): ");
        String user = sc.nextLine();
        
        if (! user.equals("y")) {
        	System.out.println("Sorry, you must be the owner to use the application.");
        	System.exit(1);
        } else {
        	user = "Owner";
        }     
        
                             
        VehicleConstructor vC = new VehicleConstructor(user);
        
        try {
			vC.VehicleConstruction();
		} catch (Exception e) {			
			e.printStackTrace();
		}         
    }
    
}
