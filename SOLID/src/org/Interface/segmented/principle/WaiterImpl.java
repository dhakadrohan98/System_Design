package org.Interface.segmented.principle;

public class WaiterImpl implements WaiterInterface {

	@Override
	public void serveCustomers() {
		System.out.println("serving to the customers");
		
	}

	@Override
	public void takingOrders() {
		System.out.println("Taking the orders");
		
	}

}
