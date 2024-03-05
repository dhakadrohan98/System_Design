package org.AbstractFactoryPattern;

public class VehicleFactory2Impl implements VehicleFactory2{
	//Little bit complex relation
	public VehicleFactory1 getVFactory(String type) {
		switch(type) {
			case "ORDINARY":
				return new OrdinaryFactory();
			case "LUXUARY":
				return new LuxuaryFactory();
			default:
				return null;
		}
	}
}
