import java.io.*;

public class JavaTraining7 {
    public static BufferedReader br = new BufferedReader
        (new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        //問題の都合上、7-1～7-4のDog問題で纏めて回答、7-5～7-6のCoinCase問題で纏めて回答します
        //クラスはコード最下部に記載

        Dog_Answer();
        Coins_Answer();
    }



    //7-1～7-4 実行部分
    static void Dog_Answer()
    {
        System.out.println("7-1～7-4:Dogクラスを作成して、「犬種」「名前」「年齢」の設定と、犬のプロフィールを表示できるようにする");
        
        Dog dog1 = new Dog("柴犬");
        dog1.SetName("たろう");
        dog1.SetAge(2);
        dog1.ShowProfile();

        Dog dog2 = new Dog("ポメラニアン");
        dog2.SetName("ぽめぞう");
        dog2.SetAge(6);
        dog2.ShowProfile();
    }

    //7-5～7-6 実行部分
    static void Coins_Answer() throws IOException
    {
        System.out.println("7-5～7-6:CoinCaseクラスを作成する");

        CoinCase coins1 = new CoinCase();
        System.out.println("10回AddCoinsして、各硬貨の枚数と額面、全硬貨の枚数と総額を表示する");
        
        for(int i = 0; i < 10; i++)
        {
            System.out.println("追加する金額は？(日本円硬貨の額面で入力)");
            int tmp_amount = Integer.parseInt(br.readLine());
            System.out.println("追加する枚数は？");
            int tmp_count = Integer.parseInt(br.readLine());
            coins1.AddCoins(tmp_amount, tmp_count);
        }
        System.out.println("500円硬貨は " + coins1.GetCount(500) + "枚 で " + coins1.GetAmount(500) + "円 分入ってます。");
        System.out.println("100円硬貨は " + coins1.GetCount(100) + "枚 で " + coins1.GetAmount(100) + "円 分入ってます。");
        System.out.println("50円硬貨は " + coins1.GetCount(50) + "枚 で " + coins1.GetAmount(50) + "円 分入ってます。");
        System.out.println("10円硬貨は " + coins1.GetCount(10) + "枚 で " + coins1.GetAmount(10) + "円 分入ってます。");
        System.out.println("5円硬貨は " + coins1.GetCount(5) + "枚 で " + coins1.GetAmount(5) + "円 分入ってます。");
        System.out.println("1円硬貨は " + coins1.GetCount(1) + "枚 で " + coins1.GetAmount(1) + "円 分入ってます。");
        
        System.out.println("財布の中には全部で " + coins1.GetCount() + "枚 の硬貨があり、総額は " + coins1.GetAmount() + "円 です。");
    }
}

/*
Dogクラス指定内容
7-1:クラス原型の提供のみ（名前周りとShowProfileの原型）
7-2:「年齢」のメンバー・メソッド追加とShowProfileで年齢も見えるようにする
7-3:クラスの編集は無し(7-2で作成したクラスのインスタンスを2つ作成)
7-4:「犬種」のコンストラクタ追加とShowProfileで犬種も見えるようにする
*/
class Dog
{
    private String Type;
    private String Name;
    private int Age;


    public Dog(String dog_type)
    {
        Type = dog_type;
    }
    public void SetName( String nm )
    {
        Name = nm;
    }

    public void SetAge(int input_num)
    {
        Age = input_num;
    }

    public void ShowProfile()
    {
        System.out.println("犬種:" + Type + "\n名前:" + Name + "\n年齢:" + Age + "\n");
    }
}

/*
CoinCaseクラス指定内容
7-5:
・500 円、100 円、50 円、10 円、5 円、1 円が、それぞれ何枚あるかを管理する。
・AddCoins メソッドで硬貨を追加する。引数は硬貨の種類（ int ）と枚数（ int ）。
・GetCount メソッドで、指定した硬貨が、何枚あるかを取得する。引数は硬貨の種類（ int ）、戻り値は枚数（ int ）。
・GetAmount メソッドで硬貨の総額を取得する。戻り値は硬貨の総額( int )。
7-6:
・総ての硬貨の枚数を取得する、引数なしの GetCount メソッド。
・指定した種類の硬貨の総額を取得する、引数のある GetAmount メソッド。
*/
class CoinCase
{
    //500,100,50,10,5,1の順で枚数を格納
    private int Coins[] = new int[6];
    private int CoinTypes[] = {500, 100, 50, 10, 5, 1};
    
    public void AddCoins(int input_amount, int input_count)
    {
        for(int i = 0; i < CoinTypes.length; i++)
        {
            if(input_amount == CoinTypes[i])
            {
                Coins[i] += input_count;
            }
        }
    }

    public int GetCount(int input_amount)
    {
        for(int i = 0; i < CoinTypes.length; i++)
        {
            if(input_amount == CoinTypes[i])
            {
                return Coins[i];
            }
        }
        return 0;
    }

    public int GetCount()
    {
        int tmp = 0;
        for(int i = 0; i < CoinTypes.length; i++)
        {
            tmp += Coins[i]; 
        }
        return tmp;
    }

    public int GetAmount(int input_amount)
    {
        for(int i = 0; i < CoinTypes.length; i++)
        {
            if(input_amount == CoinTypes[i])
            {
                return CoinTypes[i] * Coins[i];
            }
        }
        return 0;
    }

    public int GetAmount()
    {
        int tmp = 0;
        for(int i = 0; i < CoinTypes.length; i++)
        {
            tmp += CoinTypes[i] * Coins[i]; 
        }
        return tmp;
    }
}