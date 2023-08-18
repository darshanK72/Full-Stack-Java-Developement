public class Companay {
    int n;
    boolean f = false;
    synchronized public void produce_item(int n)
    {
        if(f)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        System.out.println("Item Produced : " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item()
    {
        if(!f)
        {
            try{
                wait();
            }
            catch(Exception ex)
            {
                ex.getMessage();
            }
        }
        System.out.println("Item Consumed : " + this.n );
        f = false;
        notify();
        return this.n;
    }
    
    public static void main(String args[])
    {

    }
}

