package com.singtel.test;

import com.singtel.java.Bird;
import com.singtel.java.Cat;
import com.singtel.java.Chicken;
import com.singtel.java.Dog;
import com.singtel.java.Duck;
import com.singtel.java.Parrot;
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
		Parrot myParrotwithDogs =  new Parrot();
		myParrotwithDogs.livingWith(new Dog());
		myParrotwithDogs.walk();
		myParrotwithDogs.fly();
		myParrotwithDogs.sing();
		
		Parrot myParrotwithCats =  new Parrot();
		myParrotwithCats.livingWith(new Cat());
		myParrotwithCats.walk();
		myParrotwithCats.fly();
		myParrotwithCats.sing();
		
		Parrot myParrotWithRoosters =  new Parrot();
		myParrotWithRoosters.livingWith(new Rooster());
		myParrotWithRoosters.walk();
		myParrotWithRoosters.fly();
		myParrotWithRoosters.sing();

		Parrot myParrotWithDucks =  new Parrot();
		myParrotWithDucks.livingWith(new Duck());
		myParrotWithDucks.walk();
		myParrotWithDucks.fly();
		myParrotWithDucks.sing();
	}

}
