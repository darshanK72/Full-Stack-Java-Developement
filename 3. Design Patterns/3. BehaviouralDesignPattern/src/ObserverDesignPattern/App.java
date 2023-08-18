package ObserverDesignPattern;

public class App {

	public static void main(String[] args) {
		
		YouTubeChannel codeWithDarshan = new YouTubeChannel();
		
		User user1 = new User("Darshan");
		User user2 = new User("Prasad");
		User user3 = new User("Aakash");
		User user4 = new User("Abhishek");
		User user5 = new User("Vaishnavi");
		User user6 = new User("Krushna");
		User user7 = new User("Khushi");
		
		codeWithDarshan.suscribe(user1);
		codeWithDarshan.suscribe(user2);
		codeWithDarshan.suscribe(user3);
		codeWithDarshan.suscribe(user4);
		codeWithDarshan.suscribe(user5);
		codeWithDarshan.suscribe(user6);
		codeWithDarshan.suscribe(user7);
		
		
		codeWithDarshan.notifyUpdate(new Message("Thank You Everyone for Suscribing!!"));
		
		codeWithDarshan.unsucribe(user3);
		codeWithDarshan.unsucribe(user4);
		
		codeWithDarshan.notifyUpdate(new Message("this is new message from me "));
		
	}

}
