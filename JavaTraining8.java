import java.io.*;

public class JavaTraining8 {
    public static BufferedReader br = new BufferedReader
        (new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        Eight_One_Answer();
        Eight_Two_Answer();
        Eight_Three_Answer();
        Eight_Four_Answer();
    }

    static void Eight_One_Answer()
    {
        System.out.println("8-1:Catクラスのインスタンスを作成し、「名前」「年齢」を設定、\n「ShowProfile」と「Sleep」を実行する。");

        Cat cat1 = new Cat();

        cat1.Age = 4;
        cat1.Name = "ニャン次郎";

        cat1.ShowProfile();
        cat1.Sleep();

        System.out.println();
    }

    static void Eight_Two_Answer()
    {
        System.out.println("\n8-2:Cat・Dogのインスタンスを作成し、各処理を実行する。");

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        cat1.Age = 2;
        cat1.Name = "ネコ吉";
        dog1.Age = 3;
        dog1.Name = "ポメ";

        cat1.ShowProfile();
        dog1.ShowProfile();
        cat1.Sleep();
        dog1.Run();

        System.out.println();
    }

    static void Eight_Three_Answer()
    {
        System.out.println("\n8-3:8-2に「speak」メソッドを追加しなさい(オーバーライド)");

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        cat1.Age = 1;
        cat1.Name = "ニャビー";
        dog1.Age = 0;
        dog1.Name = "ぽち";

        cat1.ShowProfile();
        dog1.ShowProfile();
        cat1.Speak();
        dog1.Speak();

        System.out.println();
    }

    static void Eight_Four_Answer()
    {
        System.out.println("\n8-4:8-3で作成したメソッドを利用し、Animalクラスの配列[4]を作成しなさい。\nその際、配列の偶数番目にはCatクラスの、奇数番目にはDogクラスのインスタンスを設定しなさい。\nまた、配列全てのSpeakメソッドも実行しなさい。");

        Animal pets[] = new Animal[4];

        for(int i = 0; i < 4; i++)
        {
            if(i % 2 == 0)
            {
                pets[i] = new Cat();
            }
            else
            {
                pets[i] = new Dog();
            }
        }

        for(Animal Pet : pets)
        {
            Pet.Speak();
        }
    }
}

class Animal
{
    public String Name;
    public int Age;

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }

    public void Speak()
    {
        System.out.println( "......" );
    }
}

/*
8-1及び8-3のCatクラス
・Cat はメンバー、メソッド Sleep を持つ。
・Sleep を実行すると“スースー”という文字列を表示する。
・Dog クラス、Cat クラスに Speak メソッドをオーバーライドするメソッドを追加しなさい。 Dog では“ワンワン”、Cat では“ニャー”という文字列を表示します。
*/
class Cat extends Animal
{
    public void Sleep()
    {
        System.out.println("スースー");
    }

    @Override
    public void Speak()
    {
        System.out.println( "ニャー" );
    }
}

/*
8-1及び8-2のDogクラス
・Dog はメンバー・メソッドRunを持つ。
・Run を実行すると“トコトコ”という文字列を表示する。
・Dog クラス、Cat クラスに Speak メソッドをオーバーライドするメソッドを追加しなさい。 Dog では“ワンワン”、Cat では“ニャー”という文字列を表示します。
*/
class Dog extends Animal
{
    public void Run()
    {
        System.out.println("トコトコ");
    }

    @Override
    public void Speak()
    {
        System.out.println("ワンワン");
    }
}
