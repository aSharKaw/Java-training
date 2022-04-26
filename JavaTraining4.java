import java.io.*;

public class JavaTraining4 {
    public static BufferedReader br = new BufferedReader
        (new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        //11までで一回チェック

        //Four_One();
        //Four_Two();
        //Four_Three();
        //Four_Four();
        //Four_Five();
    }

    //4-1
    public static void Four_One()
    {
        System.out.println("4-1");

        for(int i = 0; i < 10; i++)
        {
            System.out.println("SPAM");
        }
    }

    //4-2
    public static void Four_Two()
    {
        System.out.println("\n4-2");

        for(int i = 1; i <= 9; i++)
        {
            System.out.println(i * 3);
        }
    }

    //4-3
    public static void Four_Three()
    {
        System.out.println("\n4-3");

        for(int i = 1; i <= 8; i++)
        {
            System.out.println(Math.pow(2, i));
        }
    }

    //4-4
    public static void Four_Four()
    {
        System.out.println("\n4-4");

        int num = 7;
        int base_num = num;

        for(int i = 1; i < base_num; i++)
        {
            num *= (base_num - i);
        }
        System.out.println(base_num + "の階乗は" + num);
    }

    //4-5
    public static void Four_Five() throws IOException
    {
        System.out.println("\n4-5");
        int num, input_num;
        num = 0;

        for(int i = 0; i < 10; i++)
        {
            input_num = Integer.parseInt(br.readLine());
            num += input_num;
        }

        System.out.println("平均値は" + (num / 10));
    }
}