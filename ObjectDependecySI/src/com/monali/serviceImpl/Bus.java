package com.monali.serviceImpl;

import com.monali.services.Vehicle;

public class Bus implements Vehicle {

	int maxSpeed;
	String fuelType;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	
	@Override
	public void move() {
		System.out.println("The Bus has maximum speed "+maxSpeed+" and fueltype "+fuelType);
	}

}
