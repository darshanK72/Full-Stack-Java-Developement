import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;


@FunctionalInterface
interface Printable
{
    public void print(String s);
}

public class MethodRefference {

    public static int add(int a,int b)
    {
        return a + b;
    }

    public void greet(String msg)
    {
        System.out.println("Welcome to the World, " + msg);
    }

    public int multiply(int a,int b)
    {
        return a * b;
    }

    public static void main(String args[])
    {
        Add a = (x,y) ->x * y;
        a.add(25, 63);

        // static method refference
        Function<Integer,Double> f = (input) -> {return Math.sqrt(input);};
        System.out.println(f.apply(242));

        Function<Integer,Double> f1 = Math::sqrt;
        System.out.println(f1.apply(2434234));

        BiFunction<Integer,Integer,Integer> f2 = (x,y) -> MethodRefference.add(x,y);
        System.out.println(f2.apply(23, 52));

        BiFunction<Integer,Integer,Integer> f3 = MethodRefference::add;
        System.out.println(f3.apply(63, 64));

        // instance method refference
        MethodRefference methodRefference = new MethodRefference();

        BiFunction<Integer,Integer,Integer> f4 = methodRefference::multiply;
        System.out.println(f4.apply(5, 52));

        Printable p = (msg) -> System.out.println(msg);
        p.print("fuck You");

        Printable p1 = methodRefference::greet;
        p1.print("This is From method refference wihch is instaance of class");


        // instance method of arbitory object refference
        Function<String,String> f5 = (String input) -> input.toUpperCase();
        System.out.println(f5.apply("This lambda expression for of artibory object input"));

        Function<String,String> f6 = String::toUpperCase;
        System.out.println(f6.apply("Method refference of arbitory object"));


        // Constructor Refference
        ArrayList<String> l = new ArrayList<String>();
        l.add("Apple");
        l.add("Banana");
        l.add("Catcuas");
        l.add("Each");

        Function<List<String>,Set<String>> f7 = (input) -> new HashSet<>(input);
        System.out.println(f7.apply(l));

        Function<List<String>,Set<String>> f8 = HashSet::new;
        System.out.println(f8.apply(l));
        

        
    }
    
}
