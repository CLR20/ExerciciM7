package com.vehicles.domain;


import com.vehicles.project.*;

import java.util.List;
import java.util.ArrayList;

public class Car extends Vehicle {


	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);		
	}
	
	@Override
	public String toString() {
		return "\nYOUR CAR: \n\tPlate: " + plate + ". \n\tBrand: " + brand  
				+ "\n\tColor: " + color + "\n\tFront wheels: " + wheels.get(0) + "; " 
				+ wheels.get(1) + "\n\tBack wheels: " + wheels.get(2) + "; " + wheels.get(3);
	}

}
