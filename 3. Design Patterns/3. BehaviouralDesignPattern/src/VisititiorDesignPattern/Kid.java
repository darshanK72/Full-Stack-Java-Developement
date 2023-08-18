package VisititiorDesignPattern;

public class Kid implements Element {

	private String name;
	
	public Kid(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
