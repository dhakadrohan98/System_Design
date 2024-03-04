package org.factory.design.pattern;

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactoryObj = new ShapeFactory();
		Shape shapeObj = shapeFactoryObj.getShape("traingle");
		shapeObj.draw();
		Shape shapeObj1 = shapeFactoryObj.getShape("SQUARE");
		shapeObj1.draw();
		Shape shapeObj2 = shapeFactoryObj.getShape("circle");
		shapeObj2.draw();

	}

}
