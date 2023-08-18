import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int nthterm = input.nextInt();

        int prev = 0;
        int next = 1;
        for(int i = 1; i <= nthterm; i++)
        {
            System.out.print(prev+" ");
            int temp = next;
            next = prev + next;
            prev = temp;
        }

        input.close();

    }
    
}
