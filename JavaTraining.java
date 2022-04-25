public class JavaTraining
{
    public static void main(String[] args)
    {
        //one_one();
        //one_two();
        //one_three();
        //one_four();
        //one_five();
        //one_six();
        //one_seven();
        //one_eight();
        one_nine();
        //one_ten();
        //one_eleven();
        //one_twelve();
    }

    //1-1
    public static void one_one()
    {
        System.out.println("1-1");
        System.out.println("Hello World");
    }

    //1-2
    public static void one_two()
    {
        System.out.println("\n1-2");

        int x = 11;        
        
        System.out.println("x=" + x);
    }

    //1-3
    public static void one_three()
    {
        System.out.println("\n1-3");

        int x, y;
        x = 13;
        y = 17;

        System.out.println("x=" + x + ",y=" + y);
    }

    //1-4
    public static void one_four()
    {
        System.out.println("\n1-4");

        int x;
        x = 13 + 17;
        
        System.out.println(x);
    }

    //1-5
    public static void one_five()
    {
        System.out.println("\n1-5");
        System.out.println(13 * 17);
    }

    //1-6
    public static void one_six()
    {
        System.out.println("\n1-6");

        int x = 7;

        x *= 3;
        System.out.println(x);

        x /= 2;
        System.out.println(x);
    }

    //1-7
    public static void one_seven()
    {
        System.out.println("\n1-7");

        int x, y, stock;

        x = 123;
        y = 456;

        stock = x;
        x = y;
        y = stock;

        System.out.println("x=" + x + ",y=" + y);
    }

    //1-8
    public static void one_eight()
    {
        System.out.println("\n1-8");

        int x, y, z;

        x = 19;
        y = 23;
        z = x * y;

        System.out.println(z);
    }

    //1-9
    public static void one_nine()
    {
        System.out.println("\n1-9");

        int x = 3;

        System.out.println(x * 2);
        System.out.println(x * 3);
        System.out.println(x * 4);
    }

    //1-10
    public static void one_ten()
    {
        System.out.println("\n1-10");
        int x = 3;

        for(int i=1; i<=3; i++)
        {
            System.out.println(Math.pow(x, i));
        }
    }

    //1-11
    public static void one_eleven()
    {
        System.out.println("\n1-11");

        int x, y;
        x = 50;
        y = 23;

        System.out.println((x / y) + "あまり" + (x % y));
    }

    //1-12
    public static void one_twelve()
    {
        System.out.println("\n1-12");

        int x = 8;

        System.out.println("x=" + x);
        x++;
        System.out.println("++:" + x);
        x--;
        System.out.println("--:" + x);
    }
}