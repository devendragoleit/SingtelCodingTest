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
---------------------------------
Assignment A  basic- 3
Now how would you model a rooster?
a. A rooster says: “Cock-a-doodle-doo”
b. How is the rooster related to the chicken?
c. Can you think of other ways to model a rooster without using inheritance?
 Chicken is genderless, hen is the female, rooster is male.So rooster and hen are chickens.Created Rooster.java class extending Chicken.java class.
Another way to model a rooster without using inheritence is to use delegation.In Delegation we use an object of a
----------------------------------

Assignment A basic- 4
Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster
a. A parrot living with dogs says: “Woof, woof”
b. A parrot living with cats says: “Meow”
c. A parrot living near the rooster says: “Cock-a-doodle-doo”
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?
Implemented Parrot which uses delegation(also Composition) with the method - "livingWith".One has to pass Instance of the Animal that the Parrot is living to get the desire behaviour (singing).Even if the parrot is living with Ducks, it will work.

-------------------------------
Assignment B. Model fish as well as other swimming animals
In addition to the birds, can you model a fish?
a. Fishes don’t sing
b. Fishes don’t walk
c. Fishes can swim
Can you specialize the fish as a Shark and as a Clownfish?
a. Sharks are large and grey
b. Clownfish are small and colourful (orange)
c. Clownfish make jokes
d. Sharks eat other fish

created a Fish interface. Created classes Shark and Clownfish which implement
Fish Inteface.
Dolphins are not exactly fish, yet, they are good swimmers
a. Can you model a dolphin that swims without inheriting from a fish class?
b. How do you avoid duplicating code or introducing unneeded overhead?
Using Composition(over inheritence) solves the problem .With this we can also avoid duplicating the code
------------------------------
Assignment D. Model animals that change their behaviour over time
Can you model a butterfly?
a. A butterfly can fly
b. A butterfly does not make a sound

Can you optimize your model to account for the metamorphosis from caterpillar to butterfly?
a. A caterpillar cannot fly
b. A caterpillar can walk (crawl)

Created butterfly class that implements animal that can fly and does not make sound.Set the behaviour as property - "isCaterpiller".Just set the property to true or false -  to account for the metamorphosis from caterpillar to
butterfly.
-----------------------------------
Assignment E. Counting animals
Suppose you have an array of animals, e.g.

Animal[] animals = new Animal[]{
new Bird(),
new Duck(),
new Chicken(),
new Rooster(),
new Parrot(),
new Fish(),
new Shark(),
new Clownfish(),
new Dolhpin(),
new Frog(),
new Dog(),
new Butterfly(),
new Cat()
};


1. Can you share the code to count:
a. how many of these animals can fly?
b. how many of these animals can walk?
c. how many of these animals can sing?
d. how many of these animals can swim?

Added code in  "solution.java"" for counting the number of anmals that can fly,walk,sing and swim for all the animals that were implemented.