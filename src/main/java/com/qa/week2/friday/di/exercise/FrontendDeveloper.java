package com.qa.week2.friday.di.exercise;

public class FrontendDeveloper implements Developer {
    private void writeJavaScript(){
        System.out.println("JavaScript is used everywhere anyway.");
    }

	@Override
	public void writeCode() {
		writeJavaScript();
		
	}
}
