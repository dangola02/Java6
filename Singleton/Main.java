//Singleton design pattern

public class Main
{
    public static void main(String args[])
    {

        Singleton x = Singleton.getInstance();


        Singleton y = Singleton.getInstance();


        Singleton z = Singleton.getInstance();


        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("  ");

        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}

class Singleton
{

    private static Singleton single_instance = null;


    public String s;


    private Singleton()
    {
        s = "Singleton pattern";
    }


    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}