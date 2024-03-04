package org.AbstractFactoryPattern;

public class LuxuaryFactory implements VehicleFactory1 {

	@Override
	public Vehicle getVehicle(String type) {

		switch(type) {
		case "MERCEDES":
			return new Luxuary1();
		case "BMW":
			return new Luxuary2();
		default:
				return null;
		}
	}

}
