
// javaの1行コメントはこのように記述します

/*
javaの複数行コメントは
このように記述します
*/

import java.util.HashSet;

public class Hello { // public classは「ここからプログラム処理が始まりますよ」という意・Helloはファイル名を記述
    public static void main(String[] args){ // javaを実行するための必須メソッド
        System.out.println("Hello IntelliJ");// 変数の値をなどをコンソールに出力するときに利用するメソッド（Hello IntelliJを出力）

        // 計算をする
        int a = 1;
        int b = 2;
        int c = a + b;  // cは3になる（1+2）
        System.out.println("1 + 2 = " + c); // 計算した結果を表示する

        // 分岐if文を使用して計算をする
        int x = 10;
        if(x < 100){
            System.out.println("条件が一致したので");
            System.out.println("処理を実行します");
        }

        // 分岐if文（else）を使用して計算をする
        int y = 100;
        if(y < 100){
            System.out.println("Yは100より小さい");
        } else {
            System.out.println("Yは100以上");
        }

        // 分岐if（else）を使用して計算をする
        int z = 200;
        if(z < 100){
            System.out.println("Zは100より小さい");
        } else if (z < 200) {
            System.out.println("Zは200より小さい");
        } else {
            System.out.println("Zは200以上");

            // 分岐switchを使用して計算をする
            int d = 1;
            switch (d){
                case 1:
                    System.out.println("dの値は1です");
                    break;
                case 2:
                    System.out.println("dの値は2です");
                    break;
                default:
                    System.out.println("dの値は1,2以外の値です");
                    break; //break;はswitchを終了する役割がある。その為break;の記述がないとcase1,case2,default全て実行されてしまう。
            }

            // 反復whileを使用して計算をする
            int e = 1;
            int amount = 0;
            while (amount < 10){
                System.out.println(e + "を足します");
                amount = amount + e;
                e++; //変数eに1ずつ足していく
            }
            System.out.println("合計は" + amount);

            // 反復do-whileを使用して計算をする
            int f = 1;
            int amount2 = 0;
            do {
                System.out.println(f + "を足します");
                amount2 = amount2 + f;
                f++; //変数fに1ずつ足していく
            } while (amount2 < 0); //必ず1回実行される
            System.out.println("合計は" + amount2);

            //反復forを使用して計算する
            for (int g = 1; g <= 3; g++) { //変数gが4以上になるまで繰り返し実行される
                System.out.println("手順Qを実行：" + g + "回目");
            }

            //配列と反復forを使用した例
            //配列のの準備
            String[] fruits = new String[3];
            fruits[0] = "リンゴ";
            fruits[1] = "オレンジ";
            fruits[2] = "ブドウ";
            //配列とforを使用したプログラム
            for(int h = 0; h < fruits.length; h++) {
                System.out.println(fruits[h]);
            }

            //反復拡張forを使用したプログラム
            //コレクション（セット）を準備する
            HashSet<String> books = new HashSet<>();//変数を宣言
            books.add("不識の国のアリス");//宣言した変数booksに要素を追加1
            books.add("ヘンゼルとグレーテル");//宣言した変数booksに要素を追加2
            books.add("銀河鉄道の夜");//宣言した変数booksに要素を追加3
            //コレクションの要素ごとに処理を実行する
            for (String book : books){
                System.out.println(book);
            }

        }
    }
}


/*
▫️学習メモ ----------------------------------
「6 コレクション」
・コレクションは複数のデータを保存することができる
・コレクションの種類は、リスト/セット/マップの3種類ある
　→リスト：要素の順序を番号で管理する
　→セット：同じ要素を重複して登録しないように管理する
　→マップ：要素をキーと呼ばれる情報で管理する

「7 制御構文」
・３つの制御構造
①順序・・・A→B→Cと順番に行う
②分岐・・・条件を満たすときはA、そうでない場合はBを行う
→if/switch
③反復・・・条件を満たしている場合はAを繰り返し行う
while：条件を満たしている間、処理を実行する
do-while：whileと同じだが、最初の一回は必ず実行される
for：「n回処理を実行する」という用途に特化した反復
拡張for：「コレクションの要素についてすべて実行する」という用途に特化した反復。
・breakは現在の処理を中断してループを抜ける。
・continueは現在の処理をスキップしてループを継続させたい時に使用する。

「8 オブジェクト指向」
オブジェクト指向とは・・・大きなプログラムを分割する手法の一つ。
→例：画面表示、キーボードからの入力、ハードディスクの読み書き、通信、その他etc...
4つの考え方から構成・・・カプセル化・ポリモーフィズム・継承・動的束縛
・処理とそのデータがセットになっている。
①カプセル化・・・必要なものだけ公開し、不必要なものは隠蔽すること。
②継承・・・あるオブジェクトにデータを追加して、新しいオブジェクトを作り出すこと。
→単一継承：◯→◯→◯/多重継承：◯◯◯→◯※javaでは単一継承が採用されている。
③ポリモーフィズム・・・複数のオブジェクトに定義されている処理に同じ名前をつけることができる機能。
④動的束縛・・・プログラムの呼び出しがどのオブジェクトの処理を呼び出すかがその場で決まる仕組み。
・クラス：特定オブジェクトの構成を定義するオブジェクト（設計書）
・インスタンス：クラスをもとに作成された特定オブジェクト（成果物）
「9 クラスの作成」
オブジェクトの設計にはクラスを使用して、クラスを作成する為には以下の作業を行う必要がある
①クラスを定義するファイルの作成
1.1つのファイルに1つのクラスを定義すること
2.クラスの名前とファイルの名前を同じにすること
3.ファイルの拡張子を「.java」とすること
②クラスの定義
③フィールド、メソッドの定義

 */