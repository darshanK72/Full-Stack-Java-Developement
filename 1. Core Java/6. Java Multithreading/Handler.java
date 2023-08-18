public class Handler {
    
    public static void main(String args[])
    {
        Companay c = new Companay();
        Producer pro = new Producer(c);
        Consumer com = new Consumer(c);

        pro.start();
        com.start();

    }
}
