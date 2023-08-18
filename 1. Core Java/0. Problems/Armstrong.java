import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(isArmstrong(num))
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

        input.close();
    }

    static boolean isArmstrong(int num)
    {
        int temp = num;
        int sum = 0;
        while(temp > 0)
        {
            int d = temp%10;
            sum += d*d*d;
            temp /=10;
        }
        if (num == sum)
        {
            return true;
        }
        else{
            return false;
        }

    }
    
}
