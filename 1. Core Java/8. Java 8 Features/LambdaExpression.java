interface A 
{
    public void greet();
}

interface Add
{
    public int add(int x,int y);
}

public class LambdaExpression
{
    public static void main(String args[])
    {

        A a1 = () -> {System.out.println("Welcome to Nashik");};

        print(a1);

        print(() -> {System.out.println("Welcome to Bombey");});
        print(() -> {System.out.println("Welcome to India");});
        print(() -> {System.out.println("Welcome to World");});
        print(() -> {System.out.println("Welcome to Allen Solly");});


        Add a = (x,y) -> {return x+ y;};

        System.out.println(a.add(23, 52));

        


        

    }

    public static void print(A a)
    {
        a.greet();
    }

    // public static void run(Add a)
    // {
    //     System.out.println(a.add(0, 0);)
    // }
}