package com.vehicles.project;

import java.util.List;

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
		return "\nYour bike: \nPlate: " + plate + "\nBrand: " + brand + "\nColor: " 
				+ color + "\nFront wheel: " + wheels.get(0) + "\nBack wheel: " + wheels.get(1);
	}

}
