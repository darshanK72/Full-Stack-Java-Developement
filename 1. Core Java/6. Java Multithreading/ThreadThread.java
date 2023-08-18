public class ThreadThread extends Thread{
    
    public void run()
    {
        try
        {
            for(int i = 1; i < 10; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception ex)
        {
            System.out.print(ex.getMessage());
        }
    }


    public static void main(String args[])
    {
        ThreadThread t1 = new ThreadThread();
        t1.start();
    }

}
