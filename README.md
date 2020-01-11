Assignment A  basic- 1
Can you implement the sing() method for the bird?
YES.
Changed the Animal Class as Abstract Class and added the abstract methods
	abstract void fly();
	abstract void sing();
a. How did you unit test it?

Created a Test Class com.singtel.java.BirdTest.java 
b. How did you optimize the code for maintainability?

Changed the Animal class initially to Abstract Class.But may be changed to Interface based on future requirements (An interface is better than a abstract class when you want multiple classes to implement that interface and when you don't have to inherit default behavior)
Prerequisites
JAVA JRE/JDK and Eclipse IDE 
Installing
Eclipse IDE - import the Project as JAVA Project and add the dependencies(if required) 
Running the tests
Run the Test Class - com.singtel.test.BirdTest.java

Built With
Eclipse IDE - IDE for JAVA
---------------------------------------
Assignment A basic- 2
Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?

a. A duck says: “Quack, quack”
b. A duck can swim
c. A chicken says: “Cluck, cluck”
d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
YES .Added Duck and Chicken classes - which extend Bird class 