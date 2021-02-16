package com.vehicles.domain;

import com.vehicles.project.*;

import java.util.List;
import java.util.ArrayList;

public class Truck extends Vehicle {
	
	public Truck (String plate, String brand, String color) {
		super (plate, brand, color);
	}
	
	
	public void addWheels (List <Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}
	
	
	public void addTwoWheels (List<Wheel> wheels) throws Exception{
		
		if (wheels.size() != 2) {
			throw new Exception();
		}
		
		Wheel rightwheel = wheels.get(0);
		Wheel leftwheel = wheels.get(1);
		
		if (rightwheel != leftwheel) {
			throw new Exception();
		}
		
		this.wheels.add(rightwheel);
		this.wheels.add(leftwheel);		
	}
	
	@Override
	public String toString() {
		return "\nYOUR TRUCK: \n\tPlate: " + plate + "\n\tBrand: " + brand + "\n\tColor: " + color
				+ "\n\tFront wheels: " + wheels.get(0) + " | " + wheels.get(1)
				+ "\n\tBack wheels: " + wheels.get(2) + " | " + wheels.get(3);
				
	}

}
