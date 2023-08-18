import java.util.ArrayList;
public class Array_List {

    public static void main(String[] args)
    {
        // ArrayList<Integer> arr = new ArrayList<>(); // ArrayList Declaration

        // // ArrayList Declaration
        // for(int i = 0; i < 20; i++)
        // {
        //     arr.add((i+1)*10);
        // }

        // // Printing ArrayList using for loop
        // System.out.print("Using For Loop : ");
        // for(int i = 0; i < arr.size(); i++)
        // {
        //     System.out.print(arr.get(i) + " ");
        // }
        // System.out.println();

        // // Printing ArrayList using for each loop
        // System.out.print("Using For each Loop : ");
        // for(Integer i:arr)
        // {
        //     System.out.print(i + " ");
        // }
        // System.out.println();

        // System.out.print("Using For Arrays.toString() of ArrayList Class : ");
        // System.out.println(arr);

        // Other Funciton on ArrayList
        ArrayList<Integer> ar = new ArrayList<>();
        // Adding element at given index
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(5);
        System.out.println(ar);
        ar.add(3,4);
        System.out.println(ar);

        // Removing element form arraylist using index
        ar.remove(2);
        System.out.println(ar);

        // Checking if arraylist contain element
        System.out.println(ar.contains(2));


        // Finding index of element
        System.out.println("Inded of 5 = " + ar.indexOf(5));
    }
    
}
