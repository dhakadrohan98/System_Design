package org.AbstractFactoryPattern;

public abstract class VehicleFactory2 implements VehicleFactory1{
	//Little bit complex relation
	public VehicleFactory1 getGroupedFactory(String type) {
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
