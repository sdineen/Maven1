package com.qa.week2.wednesday.optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		
		String item;
		if(Math.random() >= 0.5) {
		    item = "Hello";
		} else {
		    item = null;
		}
		Optional<String> optional = Optional.ofNullable(item);
		
		
		
		System.out.println(optional.isPresent());
		System.out.println(optional.orElse("Item not found"));
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
//		Computer computer = new Computer();
//		// TODO Auto-generated method stub
//		Optional<Soundcard> optional = computer.getSoundcard();
//		if(optional.isPresent()) {
//			Soundcard soundcard = optional.get();
//		}

	}

}
