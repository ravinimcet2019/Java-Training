package Abstract;

public class Circle extends Shape {
	
	double radius;
	
	public Circle(double radius,String color) {
		super(color);
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}