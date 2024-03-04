package org.AbstractFactoryPattern;

public class Luxuary1 implements Vehicle {

	@Override
	public double average(double distance, double petrol) {
		
		return distance/ petrol;
	}

	@Override
	public String toString() {
		return "Luxuary1 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
