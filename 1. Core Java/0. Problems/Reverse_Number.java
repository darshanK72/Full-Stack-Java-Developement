import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        long num = input.nextLong();
        System.out.println("Normal Number : "+num);
        long rev = 0;

        while(num > 0)
        {
            rev = (rev*10) + num%10;
            num /=10;
        }
        System.out.println("Reverse Number : "+rev);

        input.close();

    }
    
}
