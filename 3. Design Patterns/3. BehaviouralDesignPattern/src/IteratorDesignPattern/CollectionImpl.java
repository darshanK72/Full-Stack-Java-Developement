package IteratorDesignPattern;

public class CollectionImpl implements Collection{
	
	String[] list = {"Apple","Banana","Cucumber","Papaya","Pineapple","Guava"};

	@Override
	public Iterator getIterator() {
		return new Iter();
	}
	
	
	private class Iter implements Iterator
	{
		int index = 0;

		@Override
		public boolean hasNext() {
			if(index < list.length)
			{
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			return list[index++];
		}
		
	}
}
