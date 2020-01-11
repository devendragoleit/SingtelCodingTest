package com.singtel.test;

import com.singtel.java.Bird;
import com.singtel.java.Chicken;
import com.singtel.java.Duck;
import com.singtel.java.Rooster;
import com.singtel.java.RoosterDelegation;

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
		com.singtel.java.Animal myRooster =  new Rooster();
		myRooster.walk();
		myRooster.fly();
		myRooster.sing();
		
		RoosterDelegation myRoosterDel =  new RoosterDelegation();
		myRoosterDel.walk();
		myRoosterDel.fly();
		myRoosterDel.sing();
	}

}
