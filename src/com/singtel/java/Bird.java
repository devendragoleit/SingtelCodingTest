package com.singtel.java;

public class Bird implements Animal {	

	 public boolean fly() {
			System.out.println("I am flying");
			return true;
			}

		  public boolean sing() {

			System.out.println("I am Singing");
			return true;
		}

		@Override
		public boolean walk() {
			
				System.out.println("I am walking");
			return true;
			
		}

		@Override
		public boolean swim() {
			// TODO Auto-generated method stub
			return false;
		}
	
}
