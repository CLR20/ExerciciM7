package com.vehicles.domain;

import com.vehicles.project.*;
import com.vehicles.domain.*;
import com.vehicles.application.*;

public class License {
	
	private static String licenseType;
	private static String licenseExp;
	private static String completName = Person.getName();
	private static Boolean check;
	
	public License (String licenseType, String licenseExp) {
		
		this.licenseType = licenseType;
		this.licenseExp = licenseExp;
	}

	public static String getLicense() {
		
		return "\n\tName: " + completName + "\n\tLicense type: " + licenseType 
				+ "\n\tExpiration date: " + licenseExp;
	}
	

    public static void checkLicense () throws Exception {
    	
    	String vehicle = VehicleConstructor.getVehicle();
    			
	    if ((! (vehicle.equals("Car") && (licenseType.matches("[B].*"))))
				&& (! (vehicle.equals("Bike") && (licenseType.matches("[A].*"))))
				&& (! (vehicle.equals("Truck") && (licenseType.matches("[C-D].*"))))) {
	    	check = false;
			throw new Exception ("The license and vehicle are not compatible");	
		}
    }
    
    public static Boolean getCheck () {
    	return check;
    }

}
