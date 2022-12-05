public class Dog extends Animal{
	public static String name;
	
	public Dog(String newname) {
	name = newname;
	}
	public void identify() {
		System.out.println("I am a Dog Woof...");
	}
	public void sayName() {
		System.out.println("My Name is "+ name +" Woof...");
	}
	public void showLove() {
		System.out.println("I show my love by Wagging Woof...");
	
		
	}
		
		
		

	private void woof() {
		System.out.println("Woof Woof");
	}
	
	@Override
	public void sleep() {
		energy++;
		hungry++;
		
		
		
	}
	@Override
	public void play() {
		mood++;
		energy--;
		
		
		
		woof();
		
	}
	@Override
	public void feed() {
		hungry--;
		mood++;
		woof();
	
	}
	
	

}
