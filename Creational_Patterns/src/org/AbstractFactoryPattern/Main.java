package org.AbstractFactoryPattern;

public class Main {

	public static void main(String[] args) {
		VehicleFactory1 vehicleFactory1 = new LuxuaryFactory();
		Vehicle vehicle = vehicleFactory1.getVehicle("MERCEDES");
		System.out.println(vehicle);

	}

}
