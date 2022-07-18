package TypesOfPolymorphosm;

public class DriverClass {

	public static void main(String[] agrs) {
		A reference;
		
		reference=new B();
		
		reference.show(); // This is static Binding, because show method is static.
		reference.display(); // This is Dynamic Binding, because we are able to call child class method using-
		                     // parent class reference.
	}
}
