package Abstract;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		
		System.out.println("Whose area do you want to see-\n1. Circle\n2. Rectangel");
		
		Scanner kb=new Scanner(System.in);
		int choice=kb.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Radius of Circle:");
			double radius=kb.nextDouble();
			Shape s1=new Circle(radius,"Red");
			System.out.println("Area of Circle: "+s1.area()+"\nColor of Circle is "+s1.getColor());
			break;
		case 2:
			System.out.println("Enter Length and width of Rectangle:");
			double length=kb.nextDouble();
			double width=kb.nextDouble();
            Shape s2=new Rectangle(length,width,"Blue");
			System.out.println("Area of Rectangle: "+s2.area()+"\nColor of Rectangle is "+s2.getColor());
			break;
		default:
			System.out.println("You enteres wrong input.");
		}
		
	}
}
