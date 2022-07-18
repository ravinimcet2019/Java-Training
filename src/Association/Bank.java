package Association;

public class Bank {

	 private String name;
	 
	    // Constructor of this class
	    Bank(String name)
	    {
	        // this keyword refers to current instance itself
	        this.name = name;
	    }
	 
	    // Method of Bank class
	    public String getBankName()
	    {
	        // Returning name of bank
	        return this.name;
	    }
}
