package Polymorphism;

public class WithoutPolymorphism {

	public static void main(String[] args) {
		Language lang=new Language();  
		lang.morningGreetings();
		
		Hindi hindi=new Hindi();      
		hindi.morningGreetings();
		
		English english=new English();    
		english.morningGreetings();
	}
}
