package fourpolymorphism;

public class shape {
	public String name;
	public int numberofSides;
	
	public double getArea(double size) {
		if(numberofSides == 3)
			return(size * size)/2;
		else if(numberofSides == 4)
			return(size * size);
		else
			return 0;
		
	}
	//this two double is overloading
	public double getArea(double height, double width) {
		if(numberofSides == 3)
			return(height * width)/2;
		else if(numberofSides == 4)
			return(height * width);
		else
			return 0;
		
	}
	
		
}
