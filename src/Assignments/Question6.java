package Assignments;

import java.util.Scanner;

public class Question6 {
    static int totalPrice=0, salesTax=0, actualPrice=0;
	
     public static void salesTax(int number) {
    	salesTax=salesTax+(number%100);
		actualPrice=actualPrice+(number-(number%100));
    }
	public static void main(String[] args) {
		
		Scanner kb =new Scanner(System.in);
		while(true) {
			System.out.println("Enter the tax-inclusive price in dollars (or -1 to end):");
			int number=kb.nextInt();
			if(number==-1)
				break;
			totalPrice=totalPrice+number;
			System.out.println("Actual Price is: $"+(number-(number%100)));
			System.out.println("Sales Tax is: $"+number%100);
			salesTax(number);
			
		}
		System.out.println("Total Price: $"+totalPrice);
		System.out.println("Total Actual Price: $"+actualPrice);
		System.out.println("Total Sales Price: $"+salesTax);
	}
}
