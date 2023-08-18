public class ThreadPriority {

	public static void main(String[] args) {
		
		Thread thread1 = new ThreadThread();
		Thread thread2 = new ThreadThread();
		Thread thread3 = new ThreadThread();
		
		thread1.setPriority(3);
		thread2.setPriority(7);
		thread3.setPriority(9);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	
		System.out.println("Thread1 Priority : " + thread1.getPriority());
		System.out.println("Thread2 Priority : " + thread2.getPriority());
		System.out.println("Thread3 Priority : " + thread3.getPriority());
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getPriority());
	}


}
