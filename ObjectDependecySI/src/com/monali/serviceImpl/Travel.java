package com.monali.serviceImpl;

import com.monali.services.Vehicle;

public class Travel {
	Vehicle v;
	public void setV(Vehicle v){
		this.v=v;
	}
	public void startJourney(){
		v.move();
	}
}
