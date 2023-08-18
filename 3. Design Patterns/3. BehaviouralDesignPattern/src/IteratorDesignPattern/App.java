package IteratorDesignPattern;

public class App {

	public static void main(String[] args) {
		
		Collection collection = new CollectionImpl();
		
		Iterator iter = collection.getIterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
