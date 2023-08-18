package CompositePattern;

public class App {

	public static void main(String[] args) {
		Employee emp1 = new Accountant(101,"Prasad Khairnar");
		Employee emp2 = new Accountant(102,"Aakash Khainrar");
		Employee emp3 = new Cashier(103,"Krushna Khainrar");
		Employee emp4 = new Cashier(104,"Abhishek Khairnar");
		Employee emp0 = new Manager(100,"Darshan Khainrar");
		
		emp0.add(emp1);
		emp0.add(emp2);
		emp0.add(emp3);
		emp0.add(emp4);
		
		emp0.display();
	}

}
