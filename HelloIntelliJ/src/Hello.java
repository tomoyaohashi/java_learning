
// javaの1行コメントはこのように記述します

/*
javaの複数行コメントは
このように記述します
*/

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

        // 分岐if文（else）を使用して計算をする
        int z = 200;
        if(z < 100){
            System.out.println("Zは100より小さい");
        } else if (z < 200) {
            System.out.println("Zは200より小さい");
        } else {
            System.out.println("Zは200以上");
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
③反復・・・条件を満たしている場合はAを繰り返し行う

 */