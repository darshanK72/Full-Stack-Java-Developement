package MediatorDesignPattern;

public class App {
	public static void main(String agrs[])
	{
		User user1 = new User("Darshan");
		User user2 = new User("Prasad");
		
		user1.sendMessage("Hello Everyone, How are you all ?");
		user2.sendMessage("I am fine Prasad, How about you ?");
	}
}
