package com.singtel.java;

public class Solution {

	public static void main(String[] args) {
		System.out.println("----------------DUCK----------------");
		Animal myDuck =  new Duck(); 
		myDuck.walk();
		myDuck.fly();
		myDuck.sing();
		System.out.println("----------------CHICKEN----------------");
		Animal myChicken =  new Chicken();
		myChicken.walk();
		myChicken.fly();
		myChicken.sing();
		System.out.println("----------------ROOSTER----------------");
		Animal myRooster =  new Rooster();
		myRooster.walk();
		myRooster.fly();
		myRooster.sing();
		System.out.println("----------------ROOSTER DELEGATION ----------------");
		RoosterDelegation myRoosterDel =  new RoosterDelegation();
		myRoosterDel.walk();
		myRoosterDel.fly();
		myRoosterDel.sing();
		System.out.println("----------------PARROT LIVING WITH DOGS----------------");
		Parrot myParrotwithDogs =  new Parrot();
		myParrotwithDogs.livingWith(new Dog());
		myParrotwithDogs.walk();
		myParrotwithDogs.fly();
		myParrotwithDogs.sing();
		System.out.println("----------------PARROT LIVING WITH CATS----------------");
		Parrot myParrotwithCats =  new Parrot();
		myParrotwithCats.livingWith(new Cat());
		myParrotwithCats.walk();
		myParrotwithCats.fly();
		myParrotwithCats.sing();
		System.out.println("----------------PARROT LIVING WITH ROOSTERS----------------");
		Parrot myParrotWithRoosters =  new Parrot();
		myParrotWithRoosters.livingWith(new Rooster());
		myParrotWithRoosters.walk();
		myParrotWithRoosters.fly();
		myParrotWithRoosters.sing();
	    System.out.println("----------------PARROT LIVING WITH DUCKS----------------");
		Parrot myParrotWithDucks =  new Parrot();
		myParrotWithDucks.livingWith(new Duck());
		myParrotWithDucks.walk();
		myParrotWithDucks.fly();
		myParrotWithDucks.sing();
		 System.out.println("----------------SHARK----------------");
	   Shark mySFish = new Shark();
	   mySFish.fly();
	   mySFish.sing();
	   mySFish.walk();
	   mySFish.swim();
	   mySFish.colour();
	   mySFish.eat();
	   mySFish.makeJokes();
	   System.out.println("----------------CLOWNFISH----------------");
	   Clownfish myCFish = new Clownfish();
	   myCFish.fly();
	   myCFish.sing();
	   myCFish.walk();
	   myCFish.swim();
	   myCFish.colour();
	   myCFish.eat();
	   myCFish.makeJokes();
	   System.out.println("----------------DOLPHIN----------------");
	   Dolphin dolphin = new Dolphin();
	   dolphin.hasFishBehaviour(new Shark());
	   dolphin.fly();
	   dolphin.sing();
	   dolphin.swim();
	   dolphin.walk();
	   
	}
}
