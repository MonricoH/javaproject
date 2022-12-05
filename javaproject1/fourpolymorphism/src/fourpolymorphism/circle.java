package fourpolymorphism;
	
public class circle extends shape{
	@Override
	public double getArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
		
	}

}
