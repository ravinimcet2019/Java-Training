package GarbageCollector;

public class Employee {

    private int empId;
	private String empName;
	private int empAge;
	private static int nextId=1;
	public Employee( String empName, int empAge) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		empId=nextId++;
	}
	
	public void show() {
		System.out.println("empId="+empId+", name="+empName+", age="+empAge);
	}
	public void showNextId() {
		System.out.println("The next emp id will be: "+nextId);
	}
	protected void finalize() {
		--nextId;
	}
}
