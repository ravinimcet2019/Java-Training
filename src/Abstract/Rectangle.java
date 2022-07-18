package Abstract;

public class Rectangle extends Shape{
	double length;
    double width;
    
    
    public Rectangle(double length, double width,String color) {
		super(color);
		this.length = length;
		this.width = width;
	}


	public double area() {
    	return length * width;
    }
}
