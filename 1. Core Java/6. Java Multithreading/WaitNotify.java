public class WaitNotify {

	public static void main(String[] args) {
		
		Integer i = 23;
		
		Thread t1 = new Thread(new WaitingThread(i));
		t1.start();
		
		Thread t2 = new Thread(new NotifyThread(i));
		t2.start();
	}

}
