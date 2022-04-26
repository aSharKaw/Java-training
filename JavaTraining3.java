import java.io.*;

public class JavaTraining3 {
    public static BufferedReader br = new BufferedReader
    (new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        //Three_One();
        //Three_Two();
        Three_Three();
        Three_Four();
        //Three_Five();
        //Three_Six();
        //Three_Seven_case1();
        //Three_Seven_case2();
        //Three_Seven_case3();
        //Three_Eight();
        //Three_Nine();
        //Three_Ten();
        Three_Eleven();
        //Three_Twelve();
        //Three_Thirteen();
    }

    public static void Three_One() throws IOException
    {
        System.out.println("3-1");

        int x, y;
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());

        System.out.println("入力値x:" + x + ", 入力値y:" + y);

        if(x > y){ System.out.println("xはyより大きい。"); }
    }

    public static void Three_Two() throws IOException
    {
        System.out.println("\n3-2");

        int x, y;
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());

        System.out.println("入力値x:" + x + ", 入力値y:" + y);

        if(x > y)
        {
            System.out.println("より大きいのは" + x);
        }
        else
        {
            System.out.println("より大きいのは" + y);
        }
    }

    public static void Three_Three() throws IOException
    {
        System.out.println("\n3-3");

        int x, y;
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());

        System.out.println("入力値x:" + x + ", 入力値y:" + y);

        if(x > y)
        {
            System.out.println("xはyより大きい");
        }
        else if(x < y)
        {
            System.out.println("xはyより小さい");
        }
    }

    public static void Three_Four() throws IOException
    {
        System.out.println("\n3-4");

        int x, y;
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());

        System.out.println("入力値x:" + x + ", 入力値y:" + y);

        if(x == y)
        {
            System.out.println("xとyは等しい");
        }
        else if(x > y)
        {
            System.out.println("xはyより大きい");
        }
        else
        {
            System.out.println("xはyより小さい");
        }
    }

    public static void Three_Five() throws IOException
    {
        System.out.println("\n3-5");

        int num = Integer.parseInt(br.readLine());
        System.out.println("入力値:" + num);

        if(num % 2 == 0)
        {
            System.out.println(num + "は偶数");
        }
        else
        {
            System.out.println(num + "は奇数");
        }
    }

    public static void Three_Six() throws IOException
    {
        System.out.println("\n3-6");

        int num = Integer.parseInt(br.readLine());
        System.out.println("入力値:" + num);

        if(num >= 0)
        {
            if(num % 2 == 0)
            {
                System.out.println("正の偶数");
            }
            else
            {
                System.out.println("正の奇数");
            }
        }
        else
        {
            if(num % 2 == 0)
            {
                System.out.println("負の偶数");
            }
            else
            {
                System.out.println("負の奇数");
            }
        }
    }

    public static void Three_Seven_case1() throws IOException
    {
        System.out.println("\n3-7,case1");

        int score = Integer.parseInt(br.readLine());
        System.out.println("入力値:" + score);

        if(score >= 60)
        {
            System.out.println("合格");
        }
        else
        {
            System.out.println("不合格");
        }
    }

    public static void Three_Seven_case2() throws IOException
    {
        System.out.println("\n3-7,case2");

        int score = Integer.parseInt(br.readLine());
        System.out.println("入力値:" + score);

        if(score >= 80)
        {
            System.out.println("たいへんよくできました。");
        }
        else if(score >= 60)
        {
            System.out.println("よくできました。");
        }
        else
        {
            System.out.println("ざんねんでした。");
        }
    }

    public static void Three_Seven_case3() throws IOException
    {
        System.out.println("\n3-7,case3");

        int score = Integer.parseInt(br.readLine());
        System.out.println("入力値:" + score);

        if(score >= 80)
        {
            System.out.println("優");
        }
        else if(score >= 70)
        {
            System.out.println("良");
        }
        else if(score >= 60)
        {
            System.out.println("可");
        }
        else
        {
            System.out.println("不可");
        }
    }

    public static void Three_Eight() throws IOException
    {
        System.out.println("\n3-8");

        int middle_score, final_score;

        System.out.println("中間試験の点数は？");
        middle_score = Integer.parseInt(br.readLine());
        System.out.println("期末試験の点数は？");
        final_score = Integer.parseInt(br.readLine());

        if((middle_score >= 60 && final_score >= 60)
            || middle_score + final_score >= 130
            || (middle_score + final_score >= 100 && (middle_score >= 90 || final_score >= 90)))
        {
            System.out.println("合格");
        }
        else
        {
            System.out.println("不合格");
        }

    }

    public static void Three_Nine() throws IOException
    {
        System.out.println("\n3-9");

        int day, term;
        
        System.out.println("利用予定の曜日はいつですか？以下の選択肢から入力してください。");
        System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
        day = Integer.parseInt(br.readLine());
        System.out.println("利用予定の時間帯はいつですか？以下の選択肢から入力してください。");
        System.out.println("0=午前、1=午後、2=夜間");
        term = Integer.parseInt(br.readLine());

        if(     (day == 0)
            || (term == 0 && (day == 2 || day == 5))
            || (term == 1 && day == 6)
            || (term == 2 && (day == 3 || day == 6)))
        {
            System.out.println("休診しています。");
        }
        else
        {
            System.out.println("開院しています。");
        }
    }
    
    //3-10
    public static void Three_Ten() throws IOException
    {
        System.out.println("\n3-10");
        
        int x, y;
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());

        System.out.println("入力値x:" + x + "入力値y:" + y);

        if(x < y && x % 2 == 0 && y % 2 == 0)
        {
            System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
        }
        if(x == y && x < 0)
        {
            System.out.println( "xとyは等しく、かつ、負の数である。" );
        }
        if(x < y || x % 2 == 0)
        {
            System.out.println( "xはyより小さい、または、xは偶数である。" );
        }
        if((x <= 10 || x >= 100) && (y <= 100 && y >= 10))
        {
            System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
        }
        if(!(x < 0 && y < 0))
        {
            System.out.println( "xもyも負の数である、ではない。" ); 
        }
    }

    //3-11
    public static void Three_Eleven() throws IOException
    {
        System.out.println("\n3-11");
        
        int month = Integer.parseInt(br.readLine());

        System.out.println(month + "月から年末までの祝日は");

        switch(month)
        {
            //「指定月から”年末”までの祝日を表示する」なのでbreak要らない…
            default:
                System.out.println("1〜12で入力してください。");
                break;
            case 1:
                System.out.println("元旦\n成人の日");
            case 2:
                System.out.println("建国記念の日");
            case 3:
                System.out.println("春分の日");
            case 4:
                System.out.println("昭和の日");
            case 5:
                System.out.println("憲法記念日\nみどりの日\nこどもの日");
            case 6:
                //祝日無し
            case 7:
                System.out.println("海の日");
            case 8:
                //祝日無し
            case 9:
                System.out.println("敬老の日\n秋分の日"); 
            case 10:
                System.out.println("体育の日");
            case 11:
                System.out.println("文化の日\n勤労感謝の日");
            case 12:
                System.out.println("天皇誕生日");
        }

        System.out.println("があります。");
    }

    //3-12
    public static void Three_Twelve() throws IOException
    {
        System.out.println("\n3-12");

        System.out.println("好きな食べ物を数字で入力してね！");
        System.out.println("1:寿司、2:ハンバーグ、3:パスタ、4:焼き肉");
        int food = Integer.parseInt(br.readLine());
        System.out.println("入力値:" + food);

        switch(food)
        {
            default:
                System.out.println("選択肢にある数字を入力してください。");
                break;
            case 1:
                System.out.println("寿司を選んだあなたは魚好き！");
                break;
            case 2:
                System.out.println("ハンバーグを選んだあなたはお肉好き！肉食！");
                break;
            case 3:
                System.out.println("パスタを選んだあなたは炭水化物好き！");
                break;
            case 4:
                System.out.println("焼肉を選んだあなたはお肉好き！");
                break;
        }
    }

    //3-13
    public static void Three_Thirteen() throws IOException
    {
        System.out.println("\n3-13");

        System.out.println("日数を確認したい月を数字で入力してください。");
        int month = Integer.parseInt(br.readLine());
        System.out.println("入力値:" + month);

        switch(month)
        {
            default:
                System.out.println("入力が間違っています");
                break;
            case 1:
                System.out.println("1月の日数は31日です。");
                break;
            case 2:
                System.out.println("2月の日数は28日です。");
                break;
            case 3:
                System.out.println("3月の日数は31日です。");
                break;
            case 4:
                System.out.println("4月の日数は30日です。");
                break;
            case 5:
                System.out.println("5月の日数は31日です。");
                break;
            case 6:
                System.out.println("6月の日数は30日です。");
                break;
            case 7:
                System.out.println("7月の日数は31日です。");
                break;
            case 8:
                System.out.println("8月の日数は31日です。");
                break;
            case 9:
                System.out.println("9月の日数は30日です。");
                break;
            case 10:
                System.out.println("10月の日数は31日です。");
                break;
            case 11:
                System.out.println("11月の日数は30日です。");
                break;
            case 12:
                System.out.println("12月の日数は31日です。");
                break;
        }
    }
}

