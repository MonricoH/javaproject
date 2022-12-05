public class Animal {
	protected int mood = 0;
	protected int energy = 0;
	protected int hungry = 0;
//	public String name;
	
	protected String name = "";
	
	
	
	
	



	public void sleep() {
		energy++;
		hungry++;
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
		
	}
	
	
	
	
	public void getStatus() {
		System.out.println("Mood: " + mood);
		System.out.println("Hunger: " + hungry);
		System.out.println("Energy: " + energy);
		
		
	}
	
	
	
	
	

}
