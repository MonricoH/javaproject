public class dog {
	//body class
	String  breed;  //data member
	int age;
	String color;
	
	static int numberOfInstance = 0; 
	
	
	public void bark() {//instance method
		System.out.println("aw aw aw");
	}
	public void sleep() {
		System.out.println("ZZZZZzzzzzz");
	}
	public void eat() {
		System.out.println("yum yum yum");
	}
	
	public static void printNumberOfInstances() { //static methods
		System.out.println(numberOfInstance);	
	}
}
