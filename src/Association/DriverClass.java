package Association;

public class DriverClass {
	
	public static void main(String[] args)
    {
 
        // Creating objects of bank and Employee class
        Bank bank = new Bank("HDFC Bank");
        Employee emp = new Employee("Ravi Rathore");
 
        System.out.println(emp.getEmployeeName()
                           + " is employee of "
                           + bank.getBankName());
    }
}
