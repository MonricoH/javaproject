package threeInheritance;

public class Human {
	public String lastname;
	public String firstname;
	public int age;
	public String sex;
	
	public void greet(String text) {
		System.out.println("Hello " + text);
	}
	
	public String getSalutation() {
		if(sex.toUpperCase().equals("MALE"))
			return "Sir";
		else if(sex.toUpperCase().equals("FEMALE"))
			return "Maam";
		else
			return"";
		
	}
	
	
}
