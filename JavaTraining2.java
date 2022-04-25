import java.io.*;

public class JavaTraining2 {
    public static BufferedReader br = new BufferedReader
    (new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        Two_One();
        Two_Two();
        Two_Three();
        Two_Four();
        Two_Five();
        Two_Six();
    }

    public static void Two_One() throws IOException
    {
        System.out.println("2-1");
        String s = br.readLine();
        System.out.println("入力値:" + s);
    }

    public static void Two_Two() throws IOException
    {
        System.out.println("\n2-2");
        int x = Integer.parseInt(br.readLine());
        System.out.println("入力値:" + x);
    }

    public static void Two_Three() throws IOException
    {
        System.out.println("\n2-3");

        int x = Integer.parseInt(br.readLine());
        System.out.println("入力値:" + x);

        for(int i=1; i<=3; i++)
        {
            System.out.println(Math.pow(x, i));
        }
    }

    public static void Two_Four() throws IOException
    {
        System.out.println("\n2-4");

        int x, y;
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());

        System.out.println("入力値x:" + x + ", 入力値y:" + y);
        
        System.out.println("和:" + (x + y));
        System.out.println("差:" + (x - y));
        System.out.println("積:" + (x * y));
        System.out.println("商:" + (x / y) + "あまり" + (x % y));
    }

    public static void Two_Five() throws IOException
    {
        System.out.println("\n2-5");

        int x, y;
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());

        System.out.println("入力値x:" + x + ", 入力値y:" + y);

        System.out.println((x + y) / 2);
    }

    public static void Two_Six() throws IOException
    {
        System.out.println("\n2-6");

        System.out.println("How old are you?");
        
        int age = Integer.parseInt(br.readLine());
        System.out.println("入力値:" + age);

        //うるう年考慮しない
        System.out.println(age * 365);
    }
}
