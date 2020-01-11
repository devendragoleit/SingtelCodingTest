package com.singtel.java;
 
public class Clownfish implements Fish{

	@Override
	public void fly() {
		
			System.out.println("I cannot fly");
			
		
		
	}

	@Override
	public void sing() {
		System.out.println("I cannot sing");
		
	}

	@Override
	public void walk() {
		System.out.println("I cannot walk");
		
	}

	@Override
	public void swim() {
		System.out.println("I can swim");
		
	}

	@Override
	public void size() {
		System.out.println("I am small");
		
	}

	@Override
	public void colour() {
		System.out.println("I am Orange in colour");
	}

	@Override
	public void eat() {
		System.out.println("I dont eat other fish");
		
	}

	@Override
	public void makeJokes() {
		System.out.println("I make Jokes");
		
	}

}
