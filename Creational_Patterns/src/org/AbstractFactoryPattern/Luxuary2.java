package org.AbstractFactoryPattern;

public class Luxuary2 implements Vehicle {

	@Override
	public double average(double distance, double petrol) {
		return distance / petrol;
	}

}
