package fourpolymorphism;

public class polyDemo {

	public static void main(String[] args) {
		shape sh1 = new shape();
		sh1.name = "Square";
		sh1.numberofSides = 4;
		System.out.println("The are of " + sh1.name + "is" +  sh1.getArea(10));
		
		
		shape sh2 = new shape();
		sh2.name = "trinalge";
		sh2.numberofSides = 3;
		System.out.println("The are of " + sh2.name + "is" +  sh2.getArea(10));
		
		shape sh3 = new shape();
		sh3.name = "Rectangle";
		sh3.numberofSides = 4;
		System.out.println("The are of " + sh3.name + "is" +  sh3.getArea(7, 4));
		
		
		circle sh4 = new circle();
		sh4.name = "circle";
		sh4.numberofSides = 0;
		System.out.println("The are of " + sh4.name + "is" +  sh4.getArea(10));
		

	}

}
