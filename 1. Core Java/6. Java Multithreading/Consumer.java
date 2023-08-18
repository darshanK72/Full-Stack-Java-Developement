public class Consumer extends Thread {
    Companay c;

    Consumer(Companay c)
        {
            this.c = c;
        }

    public void run() {

        while (true) {
            this.c.consume_item();
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String args[])
    {
        
    }

}
