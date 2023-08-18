import java.util.Scanner;
public class Occurance_of_Digits {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong();
        System.out.println(n);
        int digit = input.nextInt();

        int count = 0;
        while(n > 0)
        {
            int d = (int)(n%10);
            if(d == digit)
            {
                count++;
            }
            System.out.println(d);
            n /= 10;
        }
        System.out.println("Number of Times given digit apper in Number is : "+count);

        input.close();
    }
    
}
