package ObserverDesignPattern;

public class User implements Observer{
	
	public String name;
	
	public User(String name)
	{
		this.name = name;
	}

	@Override
	public void getUpdate(Message message) {
		System.out.println("Message for "+ this.name + " : " + message.getMessage());
	}

}
