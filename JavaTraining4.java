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

        Four_Twelve();
        Four_Thirteen();
        Four_Fourteen();
        Four_Fifteen();
        Four_Sixteen();
        Four_Seventeen();
        Four_Eighteen();
        Four_Nineteen();
        Four_Twenty();
        Four_TwentyOne();
        Four_TwentyTwo();
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

    //4-12
    //「100を超える」は「100よりも大きい」条件と判断
    public static void Four_Twelve() throws IOException
    {
        System.out.println("\n4-12");

        int num = 0;

        while(num <= 100)
        {
            num += Integer.parseInt(br.readLine());
        }

        System.out.println("合計は" + num);
    }

    //4-13
    public static void Four_Thirteen() throws IOException
    {
        System.out.println("\n4-13");

        int count_s, count_b;
        count_s = 0;
        count_b = 0;

        while(count_s < 3 && count_b < 4)
        {
            System.out.println("ストライク=1 or ボール=2 ？");
            int judge = Integer.parseInt(br.readLine());
            if(judge == 1)
            {
                count_s++;
            }
            else if(judge == 2)
            {
                count_b++;
            }
        }

        System.out.println(count_b + "ボール," + count_s + "ストライク");
    }

    //4-14
    public static void Four_Fourteen() throws IOException
    {
        System.out.println("\n4-14");

        int count_s, count_b;
        count_s = 0;
        count_b = 0;

        while(count_s < 3 && count_b < 4)
        {
            System.out.println("ストライク=1 or ボール=2 or ファウル=3 ？");
            int judge = Integer.parseInt(br.readLine());
            switch(judge)
            {
                case 1:
                    count_s++;
                    break;
                case 2:
                    count_b++;
                    break;
                case 3:
                    if(count_s < 2)
                    {
                        count_s++;
                    }
                    break;
            }
        }

        System.out.println(count_b + "ボール," + count_s + "ストライク");
    }

    //4-15
    public static void Four_Fifteen() throws IOException
    {
        System.out.println("\n4-15");

        int num = Integer.parseInt(br.readLine());
        boolean prime = false;

        for(int i = 2; i < num; i++)
        {
            if(num % i != 0)
            {
                prime = true;
            }
            else
            {
                break;
            }
        }

        if(prime == true)
        {
            System.out.println(num + "は素数です。");
        }
        else
        {
            System.out.println(num + "は素数ではありません。");
        }
    }

    //4-16
    public static void Four_Sixteen() throws IOException
    {
        System.out.println("\n4-16");

        int num = Integer.parseInt(br.readLine());
        //int base_num = num;
        boolean flug = false;
        
        while(flug == false)
        {
            if(num % 2 == 0)
            {
                System.out.print("2 ");
                num /= 2;
            }
            else if(num % 3 == 0)
            {
                System.out.print("3 ");
                num /= 3;
            }
            else if(num % 5 == 0)
            {
                System.out.print("5 ");
                num /= 5;
            }
            else if(num % 7 == 0)
            {
                System.out.print("7 ");
                num /= 7;
            }
            else
            {
                if(num != 1)
                {
                    System.out.print(num);    
                }
                flug = true;
            }
        }

        //行間調整のため改行
        System.out.println();
    }

    //4-17
    public static void Four_Seventeen()
    {
        System.out.println("\n4-17");

        for(int x = 1; x <= 9; x++)
        {
            System.out.println(x + "の段");
            for(int y = 1; y <= 9; y++)
            {
                System.out.printf("%2d\n", x * y);
            }
        }
    }

    //4-18
    public static void Four_Eighteen() throws IOException
    {
        System.out.println("\n4-18");

        int input_num = Integer.parseInt(br.readLine());
        int result_num = 0;

        while(input_num != 0)
        {
            result_num += input_num;
            input_num = Integer.parseInt(br.readLine());
        }

        System.out.println("合計値は" + result_num);
    }

    //4-19
    public static void Four_Nineteen() throws IOException
    {
        System.out.println("\n4-19");

        int input_num = Integer.parseInt(br.readLine());

        int result_num, count;
        result_num = 0;
        count = 0;

        while(input_num != 0)
        {
            result_num += input_num;
            input_num = Integer.parseInt(br.readLine());
            count++;
        }

        System.out.println("平均値は" + result_num / count);
    }

    //4-20
    public static void Four_Twenty() throws IOException
    {
        System.out.println("\n4-20");

        int input_num = Integer.parseInt(br.readLine());

        for(int x = 1;x <= input_num; x++)
        {
            for(int y = 1; y <= x; y++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    //4-21
    public static void Four_TwentyOne() throws IOException
    {
        System.out.println("\n4-21");

        int input_num = Integer.parseInt(br.readLine());

        for(int x = 1;x <= input_num; x++)
        {
            for(int y = 1; y <= input_num; y++)
            {
                if(x == y || (x + y) == (input_num + 1))
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //4-22
    public static void Four_TwentyTwo()
    {
        System.out.println("\n4-22");
        
        int first_num, second_num, answer_num;
        first_num = 0;
        second_num = 1;
        answer_num = 0;

        System.out.print("0, 1");

        while(answer_num <= 1000)
        {   
            System.out.print(", ");
            System.out.print(answer_num);

            answer_num = first_num + second_num;
            first_num = second_num;
            second_num = answer_num;
        }
    }
}