import java.io.*;

public class JavaTraining5 {
    public static BufferedReader br = new BufferedReader
        (new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException
    {
        Five_One();
        Five_Two();
        Five_Three();
        Five_Four();
        Five_Five();
        Five_Six();
        Five_Seven();
        Five_Eight();
    }

    //5-1
    public static void Five_One() throws IOException
    {
        System.out.println("5-1:10個の数値を入力し、各々の数を2倍にして表示しなさい");

        int num[] = new int[10];

        System.out.println("入力");
        for(int i = 0; i < num.length; i++)
        {
            num[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("出力");
        for(int i = 0; i < num.length; i++)
        {
            System.out.println(num[i] * 2);
        }
    }

    //5-2
    public static void Five_Two() throws IOException
    {
        System.out.println("\n5-2:10個の数値を入力し、入力した順と逆順で表示しなさい");

        int num[] = new int[10];

        System.out.println("入力");
        for(int i = 0; i < num.length; i++)
        {
            num[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("出力");
        for(int i = num.length - 1; i >= 0; i--)
        {
            System.out.println(num[i]);
        }
    }

    //5-3
    public static void Five_Three() throws IOException
    {
        System.out.println("\n5-3:10個の数値を入力し、偶数と奇数に分類して表示しなさい");

        int num[] = new int[10];

        System.out.println("入力");
        for(int i = 0; i < num.length; i++)
        {
            num[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("出力");
        System.out.print("偶数：");
        for(int i = 0; i < num.length; i++)
        {
            if(num[i] % 2 == 0)
            {
                System.out.print(" " + num[i]);
            }
        }
        System.out.print("\n奇数：");
        for(int i = 0; i < num.length; i++)
        {
            if(num[i] % 2 != 0)
            {
                System.out.print(" " + num[i]);
            }
        }

        System.out.println();
    }

    //5-4
    public static void Five_Four() throws IOException
    {
        System.out.println("\n5-4:数値を繰り返し入力し、100を超えるか10回の入力後、入力された数値をすべて表示しなさい");

        int num[] = new int[10];
        int sum_num, count;
        sum_num = 0;
        count = 0;

        System.out.println("入力");
        for(int i = 0; i < num.length; i++)
        {
            if(sum_num > 100)
            {
                break;
            }

            num[i] = Integer.parseInt(br.readLine());
            sum_num += num[i];
            count++;
        }

        System.out.println("出力");
        for(int i = 0; i < count; i++)
        {
            System.out.println(num[i]);
        }
    }

    //5-5
    public static void Five_Five() throws IOException
    {
        System.out.println("\n5-5:入力された数値を 16 桁の２進数で表示するプログラムを作成しなさい");

        int value = Integer.parseInt( br.readLine() );

        int binary[] = new int[16];
        
        // 配列 binaryに0か1を代入する
        for(int i = binary.length - 1; i >= 0; i--)
        {
            binary[i] = value % 2;
            value /= 2;
        }
        
        for( int i = 0 ; i < 16 ; i++ )
            System.out.print( binary[i] );
    }

    //5-6
    public static void Five_Six()
    {
        System.out.println("\n5-6:九九表を表示するプログラムを作成しなさい");

        int kuku[][] = new int[9][9];

        // 配列 kuku に値を代入する

        for( int i = 0 ; i < 9 ; i++ )
        {
            for( int j = 0 ; j < 9 ; j++ )
                {
                    kuku[i][j] = (i + 1) * (j + 1);
                    System.out.printf( " %2d", kuku[i][j] );
                }
            System.out.println();
        }
    }

    //5-7
    public static void Five_Seven() throws IOException
    {
        System.out.println("\n5-7:1~9の数値を2つ入力し、その積を表示しなさい。ただし、積は九九表の配列を予め作成し利用しなさい");

        int kuku[][] = new int[9][9];

        for( int i = 0 ; i < 9 ; i++ )
        {
            for( int j = 0 ; j < 9 ; j++ )
                {
                    kuku[i][j] = (i + 1) * (j + 1);
                }
        }

        int first_num, second_num;
        first_num = Integer.parseInt(br.readLine());
        second_num = Integer.parseInt(br.readLine());
        
        System.out.println(kuku[first_num - 1][second_num - 1]);        
    }

    //5-8
    public static void Five_Eight() throws IOException
    {
        System.out.println("\n5-8:数値を10回入力し、小さい順に並び変えて表示しなさい");

        int num[] = new int[10];

        System.out.println("入力");
        for(int i = 0; i < num.length; i++)
        {
            num[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < num.length; i++)
        {
            for(int j = i + 1; j < num.length; j++)
            {
                if(num[i] > num[j])
                {
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }

        System.out.println("出力");
        for(int i = 0; i < num.length; i++)
        {
            System.out.println(num[i]);
        }        
    }
}
