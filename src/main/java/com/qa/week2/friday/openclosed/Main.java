package com.qa.week2.friday.openclosed;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Rectangle shape1 = new Rectangle();
		shape1.setLength(10);
		shape1.setWidth(5);
		
		Circle shape2 = new Circle();
		shape2.setRadius(4);
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(shape1);
		shapes.add(shape2);
		
		for (Shape shape : shapes) {
			System.out.println(shape.calculateArea());//polymorphism
		}
		

	}

}
