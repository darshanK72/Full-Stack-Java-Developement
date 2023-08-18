package VisititiorDesignPattern;

public class Salseman implements Visitor{
	
	public String name;
	
	public Salseman(String name)
	{
		this.name = name;
	}

	@Override
	public void visit(Element element) {
		
		System.out.println("Salseman: " + this.name + " sold school bag to kid : " + element.getName());
		
	}

}
