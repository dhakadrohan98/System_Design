package org.AbstractFactoryPattern;

public class Main {

	public static void main(String[] args) {
		VehicleFactory2Impl vehicleFactory2Impl = new VehicleFactory2Impl();
		//getting grouped Factory's object in ordinaryFactory(VehicleFactory1) variable.
		VehicleFactory1 ordinaryFactory = vehicleFactory2Impl.getVFactory("ORDINARY");
		//Getting object of Vehicle("Hyundai") in hyundai variable.
		Vehicle hyundai = ordinaryFactory.getVehicle("HYUNDAI");
		System.out.println(hyundai.average(180.0, 3.0));
		
	}

}
