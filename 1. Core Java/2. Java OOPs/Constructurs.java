public class Constructurs {
    public static void main(String args[])
    {
        Complex c = new Complex();

        System.out.println(c.real + " + " + c.img + "i");

        Complex c1 = new Complex(5,21);

        System.out.println(c1.real + " + " + c1.img + "i");

        Complex c2 = c1;

        System.out.println(c2.real + " + " + c2.img + "i");


    }
}

class Complex
{
    int real;
    int img;

    // Default constructor
    Complex()
    {
        real = 0;
        img = 0;
    }

    // Parametrised Constructor
    Complex(int r,int i)
    {
        real = r;
        img = i;
    }

    // Copy Constructor
    Complex(Complex o)
    {
        real = o.real;
        img = o.img;
    }

}
