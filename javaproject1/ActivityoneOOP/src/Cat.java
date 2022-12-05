public class Cat extends Animal {
		
	public Cat() {
	      this.name = "pussy";
	      
	      
      
  }
	
	
	
	
	
	public void identify() {
		System.out.println("I am a Cat Meow...");
	}
	public void sayName() {
		System.out.println("My Name is "+ name +" Meow...");
	}
	public void showLove() {
		System.out.println("I show my love by Purring Meow...");
	
	}
	
	
	
	
	private void meow() {
		System.out.println("Meow Meow");
	}
	
	
	public void sleep() {
		energy++;
		hungry++;
		meow();
		
		
	}
	
	public void play() {
		mood++;
		energy--;
		
		if (energy == 0 || hungry == 0) {
			System.out.println("Notice: Can't Play with no Energy!");
			System.out.println("Notice: Can't Play if Hungry!");
		}
		else
			System.out.print("");
			
		
		
		
		
	}
	
	public void feed() {
		hungry--;
		mood++;
		meow();
	
	}
	
	
	

}
