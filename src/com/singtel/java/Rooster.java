package com.singtel.java;
 
public class Rooster extends Chicken {
	public boolean fly() {
		System.out.println("I cannot fly");
		return false; 
		}

	  public boolean sing() {

		System.out.println("Cock-a-doodle-doo");
		return true;
	}
}
