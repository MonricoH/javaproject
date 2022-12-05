package encupsulationdemo;

public class Cat {
//	Making your data members private is the essence of Encapsulation
	private int mood = 0;
	private int energy = 0;
	private int hungry = 0;
	
	private void meow() {
		System.out.println("Meow Meow");
	}
	
	public void sleep() {
		energy++;
		hungry++;
	}
	
	public void play() {
		mood++;
		energy--;
		meow();
	}
	
	public void feed() {
		hungry--;
		mood++;
		meow();
	}
	
	public void status() {
		System.out.println("Mood: " + mood);
		System.out.println("Hunger: " + hungry);
		System.out.println("Energy: " + energy);
	}
}
