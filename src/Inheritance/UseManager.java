package Inheritance;

import java.util.Scanner;

public class UseManager {
public static void main(String[] agrs) {
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter name, Salary and Bonus.");
	String name=kb.nextLine();
	double salary=kb.nextDouble();
	double bonus=kb.nextDouble();
	Manager manager=new Manager(name,salary,bonus);
	System.out.println("Name of manager:"+manager.getName());
	System.out.println("Total Income of manager:"+manager.getSalary());
}
}
