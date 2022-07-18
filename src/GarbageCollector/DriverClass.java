package GarbageCollector;

public class DriverClass {

	public static void main(String[] args) {
		Employee e=new Employee("Ravi",25);
		Employee f=new Employee("Rathore",24);
		Employee g=new Employee("RThor",23);
        
		e.show();
		f.show();
		g.show();
		e.showNextId();
		System.out.println("Internship begins..");
		Employee x=new Employee("Rahul",25);
		Employee y=new Employee("suraj",25);
        x.show();
        y.show();
        x.showNextId();
        System.out.println("Internship ends...");
        x=y=null;
        System.gc();
        System.runFinalization();
        e.showNextId();
	}
}
