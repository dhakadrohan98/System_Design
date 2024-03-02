package org.liskov.susbstitution.principle;

public class Motorcycle implements Bike {
	//Motorcycle implemented all methods of Bike interface in a right manner.
	
	private boolean isEngineOn;
	private int speed;
	
	@Override
	public void turnOnEngine() {
		this.isEngineOn = true;
		
	}

	@Override
	public void accelerate() {
		speed = speed + 10;
	}
	
}
