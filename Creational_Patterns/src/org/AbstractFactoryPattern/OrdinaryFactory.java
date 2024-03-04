package org.AbstractFactoryPattern;

public class OrdinaryFactory implements VehicleFactory1 {

	@Override
	public Vehicle getVehicle(String type) {
		switch(type) {
		case "SWIFT":
			return new Ordinary1();
		case "HYUNDAI":
			return new Ordinary2();
		default:
				return null;
		}
	}

}
