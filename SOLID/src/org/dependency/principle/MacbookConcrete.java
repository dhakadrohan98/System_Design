package org.dependency.principle;

public class MacbookConcrete {
	
//	problem: 
//	- In the constructor of MacBook keyboard & mouse are initialized with WiredKeyboard & WiredMouse (concrete class),
//	- In future if one wishes to change the initialization of keyboard & mouse variables with BluetoothKeyboard & BluetoothMouse in future, he/she will not be able to do so.

	
	private WiredKeyboardImpl wiredKeyboard;
	private WiredMouse wiredMouse;
	
	public MacbookConcrete(WiredKeyboardImpl wiredKeyboard, WiredMouse wiredMouse) {
		super();
		this.wiredKeyboard = new WiredKeyboardImpl();
		this.wiredMouse = new WiredMouse();
	}
	
	
}
