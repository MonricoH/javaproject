public class Dog extends Animal{
	
	private void bark() {
		System.out.println("Woof Woof");
	}
	public Dog() {
		this.name = "Doggy ";
	}
	
	
	public void identify() {
		System.out.println("I am a Dog Woof...");
	}
	public void sayName() {
		System.out.println("My Name is " + name + " Woof...");
	}
	public void showLove() {
		System.out.println("I show my love by Wagging Woof...");
	}
	
	
	
	public void sleep() {
		energy++;
		hungry++;
		bark();
	}
	
	public void play() {
		mood++;
		energy--;
		if(energy == 0 || hungry == 0) {
			System.out.println("Notice: Can't Play with no Energy!");
			System.out.println("Notice: Can't Play if Hungry!");
		}
		else
			System.out.print("");
			
	
	}
	
	public void feed() {
		hungry--;
		mood++;
		bark();
	
	}

}
