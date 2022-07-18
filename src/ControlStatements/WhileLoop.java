package ControlStatements;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter last value of ");
		int count=1;
		while(count<=20) {
	     if(count==5 ||count==10 || count==15)   //skipping when count==5 or count==10 or count==15. 
	     {    
	    	 count++;
	    	 continue;
	     }
	     System.out.println(count);
	     count++;
		}
		System.out.println("Thank you...");
	}
}
