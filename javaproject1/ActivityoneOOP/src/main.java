public class main {
	public static void main(String[] args) {
		
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
//		PROGRAM OUTPUT
//		Meow Moew
//		Meow Moew
//		Meow Moew
//		Meow Moew
//		Meow Moew
//		Mood: 4
//		Hunger: -1
//		Energy: 1
//		I am a Cat Meow...
//		My Name is Pussy Meow...
//		I show my love by Purring Meow...
		
		System.out.println();
		Cat cat2 = new Cat();
		cat2.sayName();
		cat2.play();
//		PROGRAM OUTPUT
//		My Name is Mingming Meow...
//		Notice: Can't Play with no Energy!
//		Notice: Can't Play if Hungry!


	}

}
