package ObserverDesignPattern;

import java.util.HashSet;
import java.util.Set;

public class YouTubeChannel implements Subject{
	
	Set<Observer> sucribers = new HashSet<>();

	@Override
	public void suscribe(Observer observer) {
		this.sucribers.add(observer);
	}

	@Override
	public void unsucribe(Observer observer) {
		this.sucribers.remove(observer);
	}

	@Override
	public void notifyUpdate(Message message) {
		for(Observer user : sucribers)
		{
			user.getUpdate(message);
		}
		
	}

}
