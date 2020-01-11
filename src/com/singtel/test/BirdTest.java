package com.singtel.test;

import com.singtel.java.Bird;
import com.singtel.java.Chicken;
import com.singtel.java.Duck;

public class BirdTest {

	public static void main(String[] args) { 
		com.singtel.java.Animal myDuck =  new Duck();
		myDuck.walk();
		myDuck.fly();
		myDuck.sing();
		com.singtel.java.Animal myChicken =  new Chicken();
		myChicken.walk();
		myChicken.fly();
		myChicken.sing();
	}	

}
