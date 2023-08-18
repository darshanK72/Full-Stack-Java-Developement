package ObserverDesignPattern;

public interface Subject {
	
	public void suscribe(Observer observer);
	public void unsucribe(Observer observer);
	public void notifyUpdate(Message message);

}
