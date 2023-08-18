package PrototypePattern;

public class App {
	public static void main(String args[])
	{
		Employee e1 = new Employee(11121,"Darshan","Khairnar",340000);
		System.out.println(e1);
		System.out.println(e1.hashCode());
		
		Employee e2 = e1.clone();
		System.out.println(e2);
		System.out.println(e2.hashCode());
		
	}
}
