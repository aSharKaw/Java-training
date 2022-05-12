import java.io.*;

public class JavaTraining7 {
    public static BufferedReader br = new BufferedReader
        (new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        //クラスはコード最下部に記載
        //Seven_One();
        //Seven_Two();
        Seven_Three();
    }



    //7-1
    static void Seven_One()
    {
        System.out.println("7-1:指定のDogクラスを使用して、「名前の変更」「名前の表示」をしなさい");
        Dog dog1 = new Dog();
        dog1.SetName("たろう");
        dog1.ShowProfile();
    }

    //7-2
    static void Seven_Two()
    {
        System.out.println("7-2:7-1のDogクラスを改修して、「年齢の変更」「名前・年齢の表示」もできるようにしなさい");
        Dog_7_2 dog1 = new Dog_7_2();
        dog1.SetName("たろう");
        dog1.SetAge(4);
        dog1.ShowProfile();
    }

    //7-3
    static void Seven_Three()
    {
        System.out.println("7-3:7-2のDogクラスを利用してして、2匹の犬のインスタンスを作成・表示しなさい");
        Dog_7_2 dog1 = new Dog_7_2();
        Dog_7_2 dog2 = new Dog_7_2();
        
        dog1.SetName("たろう");
        dog1.SetAge(4);

        dog2.SetName("はなこ");
        dog2.SetAge(7);

        dog1.ShowProfile();
        dog2.ShowProfile();
    }
}

//7-1 指定クラス
class Dog
{
    private String Name;

    public void SetName( String nm )
    {
        Name = nm;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "です。" );
    }
}

//7-1 回答
/*
練習問題 7 - 2
前問の Dog クラスに、次の内容を追加しなさい。

年齢を保持する int 型のメンバー変数。
年齢を設定するメンバー・メソッド、SetAge。
ShowProfile メソッドで名前、年齢を表示するようにする。
*/
class Dog_7_2
{
    private String Name;
    //追加
    private int Age;

    public void SetName( String nm )
    {
        Name = nm;
    }

    //追加
    public void SetAge(int input_num)
    {
        Age = input_num;
    }

    public void ShowProfile()
    {
        //Ageの表示を追加
        System.out.println( "名前は " + Name + " で、年齢は " + Age + " です。" );
    }
}