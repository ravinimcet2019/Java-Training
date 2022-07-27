package Assignments;

import java.util.Scanner;

public class Question12 {
	
	public static int arithmetic(int firstNumber, int secondNumber, char operator) {
		switch(operator) {
		case'+':
			return (firstNumber + secondNumber);
		case'-':
			return (firstNumber - secondNumber);
		case'*':
			return (firstNumber * secondNumber);
		case'/':
			return (firstNumber / secondNumber);
		default:
			return 0;
		}
	}
    
	public static void main(String[]args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Arithmetic expression(like 32+)");
		System.out.println("Operators should be(+,-,*,/)");
		char [] expression= scanner.next().toCharArray();
		int firstNumber=Character.getNumericValue(expression[0]);
		int secondNumber=Character.getNumericValue(expression[1]);
		int answer=arithmetic(firstNumber, secondNumber, expression[2]);
		System.out.println(firstNumber+""+expression[2]+""+secondNumber+"="+answer);
		scanner.close();
	}
}
