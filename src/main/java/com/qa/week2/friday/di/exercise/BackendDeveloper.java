package com.qa.week2.friday.di.exercise;

public class BackendDeveloper implements Developer {
    private void writeJava() {
        System.out.println("C# is just Microsoft Java anyway.");
    }

	@Override
	public void writeCode() {
		writeJava();
		
	}
}
