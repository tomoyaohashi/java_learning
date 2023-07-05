
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
 */