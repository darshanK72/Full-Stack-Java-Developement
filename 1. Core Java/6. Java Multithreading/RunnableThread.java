public class RunnableThread implements Runnable {
    

    public void run()
        {
            try
            {
                for(int i = 1; i <= 10; i++)
                {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }


    public static void main(String args[])
    {
        RunnableThread t1 = new RunnableThread();

        Thread thr = new Thread(t1);

        thr.start();
    }
    
}
