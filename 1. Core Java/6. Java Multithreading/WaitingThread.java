public class WaitingThread implements Runnable{
	Integer n;
	
	WaitingThread(Integer n)
	{
		this.n = n;
	}
	
	public void run()
	{
		synchronized (this.n)
		{
			System.out.println("Waiting for thread to notify!!");
			try {
				n.wait();
				System.out.println("Notified by the NotifierThread!");
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
			
		}
		
		
	}

}
