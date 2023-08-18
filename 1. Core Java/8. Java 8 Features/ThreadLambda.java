class MyThread implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Hello World");
    }
}
public class ThreadLambda {
    public static void main(String args[])
    {
        Runnable r = new MyThread();
        Thread th = new Thread(r);
        th.start();


        Runnable r2 = () -> {System.out.println("This is from lambda expresssion");};
        Thread th1 = new Thread(r2);
        th1.start();


        Thread th3 = new Thread(() -> {System.out.println("Fuck this world");});
        th3.start();
    }
    
}
