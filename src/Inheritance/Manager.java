package Inheritance;

public class Manager extends Employee {

	private double bonus;

	public Manager(String name,double salary,double bonus) {
		//calling parent class parameterized constructor of initializing the Employee class instance variables.
        super(name,salary);
		this.bonus = bonus;
	}

	// Getters and Setters of Manager instance.
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	 // Method of Manager class
	public double getSalary() {
		//calling parent class method using super keyword.
		double total=super.getSalary()+bonus;
		return total;
	}
}
