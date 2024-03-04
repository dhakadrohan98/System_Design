package org.AbstractFactoryPattern;

public class Ordinary2 implements Vehicle {
	
	@Override
	public double average(double distance, double petrol) {
		// TODO Auto-generated method stub
		return distance / petrol;
	}
}
