package org.liskov.susbstitution.principle;

public class Bicycle implements Bike {
	//Bicycle narrow downs the behavior of Bike interface
	private int paddleRound;
	
	@Override
	public void turnOnEngine() {
		throw new AssertionError("there is no enggine");
		
	}

	@Override
	public void accelerate() {
		paddleRound += 1;
	}

}
