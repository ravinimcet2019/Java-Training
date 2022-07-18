package ControlStatements;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Choose a number between 1 to 9 and win the game.");
		System.out.println("But, You have only 5 chances.");
		int randomNumber=(int)(Math.random()*10);
		for(int i=1;i<=5;i++) {
			System.out.println("Guess correct Number");
			int guessNumber=kb.nextInt();
			if(randomNumber==guessNumber) {
				System.out.println("Congratulations, You choose the correct one.");
				break;
			}
			else
				System.out.println("opps!, You choosed wrong. Now you left "+(5-i)+" chances.");
		}
		System.out.println("\nThank you for playing.");
	}
}
