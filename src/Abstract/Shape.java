package Abstract;

public abstract class Shape {
    String color;
    
	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
    
	//Abstract method
	public abstract double area(); 
}
