package ControlStatements;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		
		Scanner kb=new Scanner(System.in);
		char response='y';
		int totalAmount=(int)(Math.random()*9990);
		do {
			System.out.println("What operation do you want to perform:\n");
			System.out.println("a. Deposit Money\nb. Withdraw Money\nc. View Amount in Account");
			char answer=kb.next().charAt(0);
			switch(answer) {
			case 'a':
				System.out.println("Enter Amount for Deposite.");
				int amount=kb.nextInt();
				totalAmount=totalAmount+amount;
				System.out.println("Added Successfuliy.");
				break;
			case 'b':
				System.out.println("Enter Amount for Withdraw.");
				int withdrawlAmount=kb.nextInt();
				totalAmount=totalAmount-withdrawlAmount;
				System.out.println("Added Successfuliy.");
				break;
			case 'c':
				System.out.println("Account Balance is "+totalAmount);
				break;
			
			default:
				System.out.println("You entered wrong option.");
			}
			
			System.out.println("\nDo you want to continue(y/n):");
			response=kb.next().charAt(0);
		}while(response=='y');
		System.out.println("Thank you...");

	}
}
