package com.singtel.java;

public class Dog implements Animal{

	@Override 
	public void fly() {
		System.out.println("I cannot fly");
		
	}

	@Override
	public void sing() {
		System.out.println("Woof, woof");
		
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
		
	}

}
