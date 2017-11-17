package com.monali.serviceImpl;

import com.monali.services.Vehicle;

public class Car implements Vehicle {
	int maxSpeed;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		System.out.println("The car has maximun speed: "+maxSpeed);
	}
	
}
