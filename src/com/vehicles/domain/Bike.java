package com.vehicles.domain;

import java.util.List;

import com.vehicles.project.*;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void addWheels(List<Wheel> frontWheel, List<Wheel> backWheel) throws Exception {
		addWheel(frontWheel);
		addWheel(backWheel);
	}

	public void addWheel(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)
			throw new Exception();

		Wheel wheel = wheels.get(0);
		
		this.wheels.add(wheel);
	}
	
	@Override
	public String toString () {
		return "\nYOUR BIKE: \n\tPlate: " + plate + "\n\tBrand: " + brand + "\n\tColor: " 
				+ color + "\n\tFront wheel: " + wheels.get(0) 
				+ "\n\tBack wheel: " + wheels.get(1);
	}

}
