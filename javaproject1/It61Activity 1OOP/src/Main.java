public class Main {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.feed();
		animal1.feed();
		animal1.feed();
		animal1.sleep();
		animal1.sleep();
		animal1.play();
		animal1.getStatus();		
		
//		PROGRAM OUTPUT
//		.... ....
//		.... ....
//		.... ....
//		.... ....
//		.... ....
//		Mood: 4
//		Hunger: -1
//		Energy: 1
		
		System.out.println();
		Animal animal2 = new Animal();
		animal2.play();
//		PROGRAM OUTPUT
//		Notice: Can't Play with no Energy!
//		Notice: Can't Play if Hungry!
		
		System.out.println();	
		Cat cat1 = new Cat();
		cat1.feed();
		cat1.feed();
		cat1.feed();
		cat1.sleep();
		cat1.sleep();
		cat1.play();
		cat1.getStatus();
		cat1.identify();
		cat1.sayName();
		cat1.showLove();
////		PROGRAM OUTPUT
////		Meow Moew
////		Meow Moew
////		Meow Moew
////		Meow Moew
////		Meow Moew
////		Mood: 4
////		Hunger: -1
////		Energy: 1
////		I am a Cat Meow...
////		My Name is Pussy Meow...
////		I show my love by Purring Meow...
//		
//		System.out.println();
//		Cat cat2 = new Cat();
//		cat2.sayName();
//		cat2.play();
////		PROGRAM OUTPUT
////		My Name is Mingming Meow...
////		Notice: Can't Play with no Energy!
////		Notice: Can't Play if Hungry!
		
		
//		System.out.println();
//		Dog dog1 = new Dog();
//		dog1.feed();
//		dog1.feed();
//		dog1.feed();
//		dog1.sleep();
//		dog1.sleep();
//		dog1.play();
//		dog1.getStatus();
//		dog1.identify();
//		dog1.sayName();
//		dog1.showLove();
////		PROGRAM OUTPUT
////		Woof Woof
////		Woof Woof
////		Woof Woof
////		Woof Woof
////		Woof Woof
////		Mood: 4
////		Hunger: -1
////		Energy: 1
////		I am a Dog Woof...
////		My Name is Doggy Woof...
////		I show my love by Wagging Woof...
//		
//		System.out.println();
//		Dog dog2 = new Dog();
//		dog2.sayName();
//		dog2.play();
//		PROGRAM OUTPUT
//		My Name is Pakkun Woof...
//		Notice: Can't Play with no Energy!
//		Notice: Can't Play if Hungry!		
		
		
		
		

	}

}
