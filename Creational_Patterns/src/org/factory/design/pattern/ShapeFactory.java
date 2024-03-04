package org.factory.design.pattern;

public class ShapeFactory {
	
	public Shape getShape(String input) {
		switch(input) {
			case "CIRCLE":
				return new Circle();
			case "SQUARE":
				return new Sqaure();
			case "TRAINGLE":
				return new Traingle();
			case "circle":
				return new Circle();
			case "sqaure":
				return new Sqaure();
			case "traingle":
				return new Traingle();
			default:
				return null;
		}
	}
}
