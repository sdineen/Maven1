package com.qa.week2.friday.openclosed.greeting;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting greeting = new FormalGreeting();;
		greeter.setGreeting(greeting );
		greeter.greet();
	}

}
