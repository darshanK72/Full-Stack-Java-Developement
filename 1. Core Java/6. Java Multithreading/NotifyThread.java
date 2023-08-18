public class NotifyThread implements Runnable{
	
	Integer n;
	
	public NotifyThread(Integer n)
	{
		this.n = n;
	}
	
	public void run()
	{
		synchronized(this.n)
		{
			System.out.println("Notifying the thread!!");
			n.notify();
			System.out.println("Notified!!");
			
		}
	}

}
