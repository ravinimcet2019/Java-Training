package Interface;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter your weight in KG");
		double weight=kb.nextDouble();
		System.out.println("Enter your height in inches");
		double height=kb.nextDouble();
        Conversion con=new TryConversoin();
        System.out.println("Your Weight:"+con.kgToGram(weight)+" gram");
        System.out.println("Your Height:"+con.inchesToMm(height)+" mm");

	}
}
