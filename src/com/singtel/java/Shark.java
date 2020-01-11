package com.singtel.java;

public class Shark implements Fish{

	@Override
	public void size() {
		System.out.println("I am large");
		
	} 

	@Override
	public void colour() {
		System.out.println("I am grey in colour");
	}

	@Override
	public void eat() {
		System.out.println("I eat other fish");
		
	}

	@Override
	public void makeJokes() {
		System.out.println("I don't make Jokes");
		
	}

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

}
