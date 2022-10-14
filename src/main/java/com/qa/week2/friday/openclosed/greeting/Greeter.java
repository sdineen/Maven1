package com.qa.week2.friday.openclosed.greeting;

public class Greeter {
	private Greeting greeting;
	
	Greeting getGreeting() {
		return greeting;
	}

	void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

	public void greet() {
		greeting.greet();
		
	}

}
