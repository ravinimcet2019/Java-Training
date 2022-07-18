package Types;

import java.util.Scanner;

public class Operators {

	static double rateOfIncreament=7;
	double salary;

	
	public static double getSalary(double salary) {
		 
		return salary+(salary/100*rateOfIncreament);
	}
	
	
	public static void main(String [] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Your Name");
        String name=kb.next();
        System.out.println("Enter Your gender(M/F)");
        char gender=kb.next().charAt(0);
		System.out.println("Enter Your Salary");
		double sal=kb.nextDouble();
		System.out.println("Enter Your Status");
        boolean status=kb.nextBoolean();
		System.out.println(name+" increamented Salary is:"+getSalary(sal));
	}
}
