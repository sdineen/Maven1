package com.qa.week2.friday.di.exercise;

import java.util.ArrayList;
import java.util.List;

public class Project {

	public static void main(String[] args) {
		Developer d1 = new BackendDeveloper();		Developer d2 = new FrontendDeveloper();
		
		List<Developer> developers = 
				new ArrayList<>();
		developers.add(d1);		developers.add(d2);
		
		for (Developer developer : developers) {
			
			developer.writeCode();
		}
		

	}

}
