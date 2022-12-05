package threeInheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		Human human1 = new Human();
		
		
		human1.sex = "female";
		human1.greet(human1.getSalutation() + " jaya ");
		
		Employee emp1 = new Employee();
		
		emp1.sex = "male";
		emp1.greet(emp1.getSalutation() + " mm ");
		
		emp1.dailytRate = 400;
		emp1.workDays = 20;
		System.out.println("Your sallary is " + emp1.computeSalary());
	}

}
