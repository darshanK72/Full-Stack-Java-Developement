package VisititiorDesignPattern;

public class Doctor implements Visitor{
	
	public String name;
	
	public Doctor(String name)
	{
		this.name = name;
	}

	@Override
	public void visit(Element element) {
		System.out.println("Doctor : " + this.name + " visited and did checkup of kid : " + element.getName());
	}

}
