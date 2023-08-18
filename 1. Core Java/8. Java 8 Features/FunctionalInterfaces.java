@FunctionalInterface
interface Greetings
{
    public void greet();

    default void hello()
    {
        System.out.println("I Wnanna do something greate");
    }

    public static void study()
    {
        System.out.println("I Must study hard");
    }
}

public class FunctionalInterfaces {

    public static void main(String args[])
    {
        Greetings g1 = ()->{System.out.println("Fuck This World!!");};

        g1.greet();

        g1.hello();

        Greetings.study();

    }

    
}
