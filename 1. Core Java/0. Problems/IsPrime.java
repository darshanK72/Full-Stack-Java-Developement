import java.util.Scanner;
public class IsPrime {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(isPrime(num));


        input.close();
    }

    static boolean isPrime(int num)
    {
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
}
