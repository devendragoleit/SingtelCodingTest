package com.singtel.java;

public class Dolphin implements Animal{

	Fish fish;
	 
	void hasFishBehaviour(Fish fish)
	{
		this.fish =fish;
	}
	@Override
	public void fly() {
		
		fish.fly();

	}

	@Override
	public void sing() {
		fish.sing();
		
	}

	@Override
	public void walk() {
		fish.walk();
		
	}
	public void swim() {
		fish.swim();
		
	}

}
