package com.qa.week2.friday.solid;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("black", "Mondeo", 12300);
		Driver driver1 = new Driver(car1);
		driver1.drive(100);
		
		Mechanic mechanic1 = new Mechanic(car1);
		mechanic1.changeTyres();

	}

}
