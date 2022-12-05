package threeInheritance;

public class Employee extends Human {
	public String designation;
	public int dailytRate;
	public int workDays;
	
	
	public double computeSalary() {
		return dailytRate * workDays;
	
	}
}
