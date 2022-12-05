
public class objectandclassdemo {

	public static void main(String[] args) {
		dog dog1 = new dog(); // create an instance class
		dog dog2 = new dog(); // create an instance class
		
		dog1.breed = "switsu "; // this is how we invoke instance data members
		dog1.age = 11;
		dog1.color = " brown";
		
		dog2.breed = "husky ";
		dog2.age = 12;
		dog2.color = " white";
		
		dog.numberOfInstance = 2; //this how we invoke static data members
		
		System.out.println("I love " + dog1.breed  +"and his age is " + dog1.age +" and his color is"+ dog1.color );
		System.out.println("I love " + dog2.breed  +"and his age is " + dog2.age +" and his color is"+ dog2.color );
		
		
		dog1.bark(); //this is how we invoke instance method
		dog1.sleep();
		dog1.eat();
		dog.printNumberOfInstances(); //this is how we call static methods
	}

}
