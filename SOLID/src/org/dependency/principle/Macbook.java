package org.dependency.principle;

public class Macbook {
	
	//Dependency inversion principle is implemented here.
	
	private Keyboard keyboard;
	private Mouse mouse;
	
	public Macbook(Keyboard keyboard, Mouse mouse) {
		this.keyboard = keyboard;
		this.mouse = mouse;
	}
}
