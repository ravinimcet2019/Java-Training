package Polymorphism;

public class UsingPolymorphism {

	public static void main(String[] args) {
		Language lang;
		lang=new Language();
		lang.morningGreetings();
		
		lang=new Hindi();
		lang.morningGreetings();
		
		lang=new English();
		lang.morningGreetings();
	}
}
