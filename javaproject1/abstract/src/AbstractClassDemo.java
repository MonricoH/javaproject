public class AbstractClassDemo {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("Garfield");
		cat1.setSex("Male");
		cat1.setAge(12);
		
		
		System.out.println(cat1.getName() + " says " + cat1.speak());
		System.out.println(cat1.getName() + " eats " + cat1.GetDiet());

	}

}
