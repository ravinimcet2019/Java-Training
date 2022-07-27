package Assignments;

import java.util.Scanner;

public class Question8 {

	 public static void timeTable(int n) {
		System.out.print("   *  ");
		for(int i=1;i<=n;i++) {
			System.out.format("%4d",i);
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		for(int i=1;i<=n;i++) {
			System.out.format("%4d |",i);
			for(int j=1;j<=n;j++) {
				System.out.format("%4d",i*j);
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter Size for Print Table:");
    	int n=kb.nextInt();
		timeTable(n);
	}
}
