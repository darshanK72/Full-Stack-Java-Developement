import java.util.Optional;



public class OptionalClass {
    static int count = 0;
    public static Optional<String> getString()
    {
        count++;
        if(OptionalClass.count % 2 == 0)
        {
            return Optional.of("Fuck You");
        }
        return Optional.empty();
    }

    public static void main(String args[]) throws Exception
    {

        Optional<Object> o = Optional.empty();
        System.out.println(o);

        String s1 = "This is Optional String";
        Optional<String> o1 = Optional.of(s1);
        System.out.print(o1.get());


        String s2 = OptionalClass.getString().orElseGet( () -> new String("Defalut String"));
        System.out.println(s2);

        String s3 = OptionalClass.getString().orElse(new String("Defalut String"));
        System.out.println(s3);

        String s4 = OptionalClass.getString().orElse(new String("Defalut String"));
        System.out.println(s4);

        String s5 = OptionalClass.getString().orElseThrow(() -> new Exception("Null String optional"));
        System.out.println(s5);

        // String s6 = OptionalClass.getString().orElseThrow(() -> new Exception("Null String optional"));
        // System.out.println(s6);


        String s7 = "            abc                ";

        Optional<String> o7 = Optional.of(s7);

        o7.filter((msg) -> msg.contains("abc")).ifPresent((msg) -> System.out.println(msg.trim()));

        o7.filter((msg) -> msg.contains("abc")).map(String::toUpperCase).ifPresent((msg) -> System.out.println(msg));


    }
    
}
