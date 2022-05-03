import java.io.*;

public class JavaTraining4 {
    public static BufferedReader br = new BufferedReader
        (new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        Four_One();
        Four_Two();
        Four_Three();
        Four_Four();
        Four_Five();
        Four_Six();
        Four_Seven();
        Four_Eight();
        Four_Nine();
        Four_Ten();
        Four_Eleven();
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

    //4-6
    public static void Four_Six() throws IOException
    {
        System.out.println("\n4-6");
        int win_count, lose_count;

        win_count = 0;
        lose_count = 0;

        for(int i = 0; i < 10; i++)
        {
            if(Integer.parseInt(br.readLine()) == 0)
            {
                lose_count++;
            }
            else
            {
                win_count++;
            }
        }
        System.out.println("勝ち:" + win_count + ", 負け:" + lose_count);
    }

    //4-7
    public static void Four_Seven() throws IOException
    {
        System.out.println("\n4-7");
        int giants_score, tigers_score;

        giants_score = 0;
        tigers_score = 0;

        for(int lound = 1; lound <= 9; lound++)
        {
            System.out.print(lound + "回表、巨人の得点は？");
            giants_score += Integer.parseInt(br.readLine());
            
            System.out.print(lound + "回裏、阪神の得点は？");
            tigers_score += Integer.parseInt(br.readLine());
            
        }
        System.out.println("\n巨人：" + giants_score + "点, 阪神：" + tigers_score + "点");

        if(giants_score == tigers_score)
        {
            System.out.println("引き分け");
        }
        else if(giants_score > tigers_score)
        {
            System.out.println("巨人の勝ち");
        }
        else
        {
            System.out.println("阪神の勝ち");
        }
    }

    //4-8
    public static void Four_Eight() throws IOException
    {
        System.out.println("\n4-8");
        int max_num = 0;

        for(int i = 0; i < 10; i++)
        {
            int num = Integer.parseInt(br.readLine());
            if(num > max_num || i == 0)
            {
                max_num = num;
            }
        }
        System.out.println("最大値は" + max_num);
    }

    //4-9
    public static void Four_Nine() throws IOException
    {
        System.out.println("\n4-9");
        int max_num, min_num;
        max_num = 0;
        min_num = 0;

        for(int i = 0; i < 10; i++)
        {
            int num = Integer.parseInt(br.readLine());
            if(i == 0)
            {
                max_num = num;
                min_num = num;
            }
            else if(num > max_num)
            {
                max_num = num;
            }
            else if(num < min_num)
            {
                min_num = num;
            }
        }
        System.out.println("最大値は" + max_num + "、最小値は" + min_num);
    }

    //4-10
    public static void Four_Ten() throws IOException
    {
        System.out.println("\n4-10");

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++)
        {
            System.out.print("*");
        }
        //行間調整のため改行
        System.out.println();
    }

    //4-11
    public static void Four_Eleven() throws IOException
    {
        System.out.println("\n4-11");

        int num = Integer.parseInt(br.readLine());
        int output_num = 0;

        for(int i = 0; i < num; i++)
        {
            System.out.print(output_num);
            output_num++;
            
            if(output_num == 10)
            {
                output_num = 0;
            }
        }
        //行間調整のため改行
        System.out.println();
    }
}