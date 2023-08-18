import java.util.Scanner;
public class j13BitManipulation {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int n = in.nextInt();

        System.out.println("Enter position for getting bit : ");
        int pos = in.nextInt();

        System.out.println("Bit at that position : " + getBit(n,pos));

        System.out.println(setBit(n,1));

        System.out.println(clearBit(n,0));


        System.out.println(toggleBit(n,1));



        in.close();
    }

    public static int getBit(int n,int pos)
    {
        int bitmask = 1<<pos;
        if((bitmask & n) != 0)
        {
            return 1;
        }
        return 0;
    }

    public static int setBit(int n,int pos)
    {
        int bitmask = 1<<pos;

        return bitmask | n;
    }

    public static int clearBit(int n,int pos)
    {
        int bitmask = 1 << pos;

        return ~bitmask & n;
    }

    public static int toggleBit(int n,int pos)
    {
        int bitmask = 1 << pos;

        return bitmask ^ n;


    }
}
