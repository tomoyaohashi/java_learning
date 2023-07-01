
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
    }
}


