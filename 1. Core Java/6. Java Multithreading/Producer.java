public class Producer extends Thread{ 
    Companay c;

    Producer(Companay c)
    {
        this.c = c;
    }

    public void run()
    {
        int i = 1;
        while(true)
        {
            this.c.produce_item(i);
            try
            {
                Thread.sleep(2000 );
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
            i++;
        }
    }

    public static void main(String args[])
    {
        
    }
}
