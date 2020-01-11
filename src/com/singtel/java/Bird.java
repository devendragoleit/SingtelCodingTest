package com.singtel.java;

public class Bird implements Animal {	
	public void fly() {
	System.out.println("I am flying");
	}

  public void sing() {

	System.out.println("I am Singing");
}

@Override
public void walk() {
	
		System.out.println("I am walking");
	
	
}
}
