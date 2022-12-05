
public abstract class Animal {

	//data members
	private String name;
	private String sex;
	private int age;
	//setters and getters
	//concrete methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//abstract methods
	
	public abstract String speak();
	public abstract String GetDiet();
	
	
}
