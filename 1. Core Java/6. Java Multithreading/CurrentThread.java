public class CurrentThread {

    public static void main(String args[])
    {
        Thread th = Thread.currentThread();
        ThreadThread th1 = new ThreadThread();

        th1.start();

        System.out.println(th1.getName());

        System.out.println(th.getName());
        System.out.println(th.getId());
        System.out.println(th);
        try
        {
            for(int i = 0; i < 10; i++)
            {
                if(i == 5)
                {
                    Thread.sleep(3000);
    
                }
                System.out.println(i+1);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
}
