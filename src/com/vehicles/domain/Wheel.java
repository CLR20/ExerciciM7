package com.vehicles.domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Wheel {
	private String brand;
	private double diameter;
	private Object[] wheel = new Object [2];
	private List wheels = new ArrayList<Wheel>();
	
	public Wheel(String brand, double diameter) {
		
		this.brand = brand;
		this.diameter = diameter;
		wheel[0] = brand;
		wheel[1] = diameter;			
	}
		
	@Override
	public String toString() {
		return "brand = " + brand + ", diameter = " + diameter;
	}
	
}
