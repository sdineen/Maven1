package com.qa.week2.junit;

public class Email {

	public boolean isValidEmail(String email) {
		String[] parts = email.split("@");
		String part1 = parts[0];
		if(parts[1].indexOf(".")==-1)
			return false;
		String[] right = parts[1].split("\\.");
		String part2 = right[0];
		String part3 = right[1];
		if(part3.length() > 3)
			return false;
		if(part1.startsWith("_"))
			return false;
		if(part1.length()==0)
			return false;	
		return true;
	}

}
