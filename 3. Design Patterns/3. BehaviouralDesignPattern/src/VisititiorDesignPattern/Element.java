package VisititiorDesignPattern;

public interface Element {
	
	public void accept(Visitor visitor);
	public String getName();

}
