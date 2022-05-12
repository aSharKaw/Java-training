import java.io.*;

public class JavaTraining6 {
    public static BufferedReader br = new BufferedReader
        (new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException
    {
        //～_run関数は、問題にて追加処理を求められている場合に、mainの煩雑化を防ぐため使用します。

        System.out.println("6-1:2乗を返す");
        System.out.println(Six_One(8));

        System.out.println("\n6-2:2つの整数の平均を返す");
        System.out.println(Six_Two(8, 4));

        Six_Three_run();

        Six_Four_run();

        Six_Five_run();

        Six_Six_run();

        Six_Seven_run();

        Six_Eight_run();
    }

    //6-1
    static int Six_One(int num)
    {
        return num * num;
    }

    //6-2
    static int Six_Two(int num1, int num2)
    {
        return (num1 + num2) / 2;
    }

    //6-3
    static int Six_Three(int num1, int num2)
    {
        if(num1 > num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }

    //6-3 問題実行用
    static void Six_Three_run() throws IOException
    {
        System.out.println("\n6-3:２つの整数の大きい方を返す");
        System.out.println(Six_Three(8, 4));
        
        
        System.out.println("\n6-3-EX:6-3のメソッドを使って、3つの入力値の最大を表示する");

        int x, y, z;
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        z = Integer.parseInt(br.readLine());
        
        System.out.println(Six_Three(x, Six_Three(y, z)));
    }

    //6-4
    static void Six_Four(int num)
    {
        for(int x = 1;x <= num; x++)
        {
            for(int y = 1; y <= x; y++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    //6-4 問題実行用
    static void Six_Four_run()
    {
        System.out.println("\n6-4:何等かの文字で指定サイズの三角形を表示する");
        Six_Four(7);
        
        
        System.out.println("\n6-4-EX:6-4のメソッドを使って、サイズが3,4,5の三角形を表示する");
        Six_Four(3);
        Six_Four(4);
        Six_Four(5);
    }

    //6-5
    static void Six_Five(int num, char sign)
    {
        for(int x = 1;x <= num; x++)
        {
            for(int y = 1; y <= x; y++)
            {
                System.out.print(sign);
            }
            System.out.println();
        }

        //表示調整
        System.out.println();
    }

    //6-5 問題実行用
    static void Six_Five_run()
    {
        System.out.println("\n6-5:指定した文字で指定サイズの三角形を表示する");
        Six_Five(4, '箱');
        
        
        System.out.println("\n6-5-EX:6-5のメソッドを使って、文字もサイズも違う3角形を3つ表示する");
        Six_Five(4, '箱');
        Six_Five(6, '□');
        Six_Five(9, '8');
    }

    //6-6
    static void Six_Six(int num)
    {
        for( int i = 1 ; i <= 9 ; i++ )
        {
            System.out.printf(" %2d", num * i);
        }
        System.out.println();
    }

    //6-6 追加分
    static void Six_Six_run()
    {
        System.out.println("\n6-6:指定した段の九九を表示する");
        Six_Six(9);

        
        System.out.println("\n6-6-EX:6-6のメソッドを使って、九九表を表示する");
        for( int i = 1 ; i <= 9 ; i++ )
        {
            Six_Six(i);
        }
    }
    
    //6-7
    static boolean Six_Seven(int num)
    {
        for(int i = 2; i < Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    //6-7 追加分
    static void Six_Seven_run()
    {
        System.out.println("\n6-7:指定した数値が素数か判断するメソッドを作成する");
        int tmp_num = 13;
        if(Six_Seven(tmp_num))
        {
            System.out.println(tmp_num + "は素数です。");
        }
        else
        {
            System.out.println(tmp_num + "は素数ではありません。");
        }


        System.out.println("\n6-7-EX:6-7のメソッドを使って、10000 以上 10100 未満の素数を表示する");
        for( int i = 10000 ; i < 10100 ; i++ )
        {
            if(Six_Seven(i))
            {
                System.out.println(i);
            }
        }
    }

    //6-8
    static int Six_Eight(int num)
    {
        if( num == 0 || num == 1)
        {
            return num;
        }
        else
        {
            return Six_Eight( num - 2 ) + Six_Eight( num - 1 );
        }
    }

    //6-8 追加分
    static void Six_Eight_run()
    {
        System.out.println("\n6-8:フィボナッチ数列の n 番目の項を計算するメソッドを作成しなさい");
        System.out.println("6番目の項は" + Six_Eight(6));

        System.out.println("\n6-8-EX:6-8メソッドを使用して、11 番目から 20 番目までの項を表示");
        for(int i = 11; i <= 20; i++)
        {
            System.out.println(i + "番目の項は" + Six_Eight(i));
        }
    }
}
