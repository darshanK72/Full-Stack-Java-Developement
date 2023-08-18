package VisititiorDesignPattern;

import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Kid> kidList = new LinkedList<>();
		kidList.add(new Kid("Darshan"));
		kidList.add(new Kid("Prasad"));
		kidList.add(new Kid("Aakash"));
		kidList.add(new Kid("Vaishnavi"));
		
		Visitor visitor1 = new Doctor("Ram Sharma");
		
		for(Kid kid : kidList)
		{
			kid.accept(visitor1);
		}
		
		Visitor visitor2 = new Salseman("Ravi Sharma");
		
		for(Kid kid : kidList)
		{
			kid.accept(visitor2);
		}

	}

}
