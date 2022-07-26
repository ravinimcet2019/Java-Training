package OopsAssingment;

public class Question3Shape {
    protected String color;
    protected boolean filled;
    
    // Non-Parametrized Constructor
	public Question3Shape() {
		super();
		this.color="red";
		this.filled=true;
		// TODO Auto-generated constructor stub
	}
	
	 // Parametrized Constructor
	public Question3Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	// Getters and Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	// toString
	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
    
    
}

     class Circle extends Question3Shape{
	
    	 private double radius;

    	 // Non-Parametrized Constructor
    	 public Circle() {
 			super();
 			this.radius=1.0;
 		}
    	 // Parametrized Constructor
		public Circle(double radius) {
			super();
			this.radius = radius;
		}
		 // Parametrized Constructor
		public Circle(String color, boolean filled, double radius) {
			super(color, filled);
			this.radius = radius;
		}

		// Getter and Setter
		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		// Method for getting Area
		public double getArea(double radius) {
			return (Math.PI * Math.pow(radius, 2));
		}
		// Method for getting Perimeter
		public double getPerimeter(double radius) {
			return (2 * Math.PI * radius);
		}

		//toString
		@Override
		public String toString() {
			return "Circle[Shape [color=" + color + ", filled=" + filled + "]radius=" + radius + "]";
		}
 }
     
     class Rectangle extends Question3Shape {
    	 protected double width;
    	 protected double length;
    	 
    	 // Non-Parametrized Constructor
		public Rectangle() {
			super();
			this.length=1.0;
			this.width=1.0;
		}
		 // Parametrized Constructor
		public Rectangle(double width, double length) {
			super();
			this.width = width;
			this.length = length;
		}
		 // Parametrized Constructor
		public Rectangle(double width, double length,String color, boolean filled) {
			super(color,filled);
			this.width = width;
			this.length = length;
		}
        
		// Getter and Setter
		public double getWidth() {
			return this.width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getLength() {
			return this.length;
		}

		public void setLength(double length) {
			this.length = length;
		}
		// Method for getting Area
		public double getArea() {
			return (this.length * this.width);
		}
		// Method for getting Perimeter
		public double getPerimeter() {
			return (2*(this.length+this.width));
		}

		@Override
		public String toString() {
			return "Rectangle[Shape [color=" + color + ", filled=" + filled + "]width=" + width + ", length=" + length + "]";
		}
		
}
     
     class Square extends Rectangle{
    	 
    	 // Non-Parametrized Constructor
    	 public Square() {
    		 super();
    	 }
    	 // Parametrized Constructor
    	 public Square(double side) {
    		 super(side,side);
    	 }
    	 // Parametrized Constructor
    	 public Square(double side,String color,boolean filled) {
    		 super(side,side,color,filled);
    	 }
    	 
    	 public void setSide(double side) {
    		 super.setLength(side);
    		 super.setWidth(side);
    	 }
    	 
    	 public double getSide() {
    		 return super.getLength();
    	 }
    	 public void setLength(double side) {
    		 super.setLength(side);
    	 }
    	 
    	 public void setWidth(double side) {
    		 super.setWidth(side);
    	 }
    	 @Override
 		public String toString() {
 			return "Square[Rectangle[Shape [color=" + color + ", filled=" + filled + "]width=" + width + ", length=" + length + "]]";
 		}
     }
     
     class Cylinder extends Circle{
    	 
    	 private double height;
    	 // Non-Parametrized Constructor
    	 public Cylinder() {
    		 super();
    		 this.height=1.0;
    	 }
    	 // Parametrized Constructor
    	 public Cylinder(double radius) {
    		 super(radius);
    		 this.height=1.0;
    	 }
    	 // Parametrized Constructor
    	 public Cylinder(double radius,double height) {
    		 super(radius);
    		 this.height=height;
    	 }
    	 // Parametrized Constructor
    	 public Cylinder(double radius,double height,String color,boolean filled) {
    		 super(color,filled,radius);
    		 this.height=height;
    	 }
    	// Getter and Setter
    	 public double getHeight() {
    		 return this.height;
    	 }
    	 public void setHeight(double height) {
    		 this.height=height;
    	 }
    	// Method for getting Volume
    	 public double getVolume() {
    		 return(Math.PI * Math.pow(super.getRadius(), 2) * this.height);
    	 }
     }
