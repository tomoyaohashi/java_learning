
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
→スーパークラス（元のクラス）、サブクラス（継承したクラス）
③ポリモーフィズム・・・複数のオブジェクトに定義されている処理に同じ名前をつけることができる機能。
④動的束縛・・・プログラムの呼び出しがどのオブジェクトの処理を呼び出すかがその場で決まる仕組み。
・クラス：特定オブジェクトの構成を定義するオブジェクト（設計書）
・インスタンス：クラスをもとに作成された特定オブジェクト（成果物）
「9 クラスの基礎」
オブジェクトの設計にはクラスを使用して、クラスを作成する為には以下の作業を行う必要がある
①クラスを定義するファイルの作成
1.1つのファイルに1つのクラスを定義すること
2.クラスの名前とファイルの名前を同じにすること
3.ファイルの拡張子を「.java」とすること
②クラスの定義
③フィールド、メソッドの定義

●継承
構文：class サブクラス名 extends スーパークラス名{※差分の処理}
・javaは単一継承の為、スーパークラスは最大1つまでしか指定できない。
・継承はスーパークラスの機能は全て使える状態で、かつ新しい機能を差分で追加すること。

「10 クラスの応用」
コンストラクター・・・クラスを設計書にしてインスタンスを作るメソッドのこと。
オーバーライド・・・スーパークラスと同じ名前のメソッドをサブクラスに定義し上書きすること。
→「super.メソッド名」を使用すればサブクラスから部分的にスーパークラスのメソッドを修正することができる。
オーバーロード・・・クラスの中で引数が異なるメソッドを複数作成できる機能。
protected・・・自分自身に加え、自分から継承されたクラスからもアクセスを許すメソッド
＠Override・・・スーパークラスとサブクラスに同じメソッドがある時に付けるキーワード（javaであらかじめ用意されたアノテーション）
final・・・クラスの継承における上書き防止をするキーワード。（オーバーライドできなくなる）
→クラスに対して使用すると継承ができなくなる。、メソッドに対して使用すると継承はできるがメソッドのオーバーライドができなくなる

内部クラス・・・クラスの中でしか使用しないことを想定したクラス。
無名内部クラス・・・1箇所でしか使わないという制限付きでクラスの名前を省略できるクラス。

「キャスト変換」
データ型の値を別のデータ型に変換すること。
①明示的キャスト
明示的にデータ型の変換を行う方法
変換したいデータ型を()で囲い、その前に変換先のデータ型を指定する。
--
double num1 = 3.14;
int num2 = (int) num1; // 明示的キャスト
--
②暗黙的キャスト
データが自動的に変換先のデータ型に変換される方法
--
int num1 = 10;
double num2 = num1; // 暗黙的キャスト
--

③参照型キャスト
--
クラス名 キャスト後の変数　= （クラス名） キャスト前の変数
--

「静的フィールド」
・クラスそのものに情報を保存するフィールド。
・staticを記述する。
「静的メソッド」
・インスタンスがない状態で呼び出すメソッド。
・staticを記述する。

「定数」
・よく使う変更されることのない値にあらかじめ別名を付けておく機能。（数学でいう円周率πのようなもの。）
・同じ値を繰り返し記述する必要がない点が利点。

「列挙型」
・状態に対して意味のある名前を付けることができる。
・「enum/イーナム」を使って定義する。
・列挙型の名前は全て大文字で区切りにアンダースコアを付けるのが一般的（例：DARK_GRAY）

「11 名前空間とアクセス制御」
⬛︎ 名前空間
・同じ名前のクラスを区別できるようにする。
・半額英数字の「.」ピリオドを組み合わせて作成する。
・ドメインを逆順にして付けることが多い。（ドメイン取得していない場合はなるべく被らない名前をつける。）
・名前空間を持ったjavaのクラスを作るには手順が必要（package）
→1.クラスの先頭に「package パッケージ名」を追加する。
→2.「クラス名.java」のjavaファイルを、パッケージに合わせてサブフォルダに保存する。
→構文：package パッケージ名;
・importでクラス名を省略することができる
→構文：import インポートする完全なクラス名

⬛︎ アクセス制御
・クラスやその中で定義されるメソッドやフィールドなどが、他の場所から見える「範囲」を制限するための仕組み。
privateアクセス修飾子・・・同じクラス内のみ呼び出しや参照ができる。
デフォルトアクセス修飾子・・・同じ名前空間内のみ呼び出しや参照ができる。
protectedアクセス修飾子・・・同じ名前空間と継承したサブクラスで呼び出しや参照ができる。（名前空間が異なる場合はクラスをpublicにする必要がある。）
publicアクセス修飾子・・・どの場所からでも参照可能。（異なる場合から呼び出す場合はクラスをpublicにする必要がある。）

「12 抽象クラスとインターフェイス」
・抽象クラス/メソッドは「abstract（アブストラクト）」を指定する。
→newを使ってインスタンス化できない
→抽象クラスを継承したサブクラスは、必ず抽象メソッドをオーバーライドして具体的な処理を書かないといけない。

⬛︎ インターフェイス
・異なるクラス同士に含まれる共通のメソッドを一つにまとめることができる機能、または共通のメソッドをまとめたもの。
・「interface」を宣言する。
①インターフェイスのファイルを作成する。
→ファイル名とインターフェイス名はクラス名同様一緒にする。
②クラスにインターフェイスを実装する
→「implements/インプリメンツ」を使用してインターフェイスを指定する。
→インターフェイスに定義されたメソッドの具体的な処理を記載する。
・implementsで指定されたクラスは、インターフェイスに定義された全てもメソッドを実装する必要がある。
・インターフェイス名は「able」で終わるようにする/共通した特徴を名前に入れる/共通した概念を名前とする。
・クラスに複数のインターフェイスを実装するときは全てのインターフェイスのメソッドを実装しなければならない。
・インターフェイスは多重継承が可能。

「13 ジェネリクス」
・「〇〇を保存する倉庫」や「〇〇を管理する名簿」の〇〇の様に汎用性を持たせ後から指定できる仕組みを「ジェネリクス」という。
・ジェネリクスを使わない場合は、取り出す際にキャスト変換や種類ごとの専用倉庫の作成が必要となる。
・構文：class クラス名<型パラメーター,・・・>{・・・}
→型パラメーターは、半完成品のクラスに対して何のオブジェクトを扱うのかを指定するためのもの
・型パタメーターは複数指定することができる。

3.ワイルドカード
・ワイルドカードを使用すると、型パラメーターで指定できる型を、特定のクラスのサブクラス・インターフェイスを実装したクラスに限定することができる。
・構文：class クラス名<型パラメーター extends ワイルドカードの型名>{・・・}

「14 例外」
・エラーが起こったことを通知したり、検出する仕組みを例外と言う。
・エラーが起きたことを認識したら「例外」を発生させて、今の処理を中断させてエラー専門の処理を実行させる。
・エラー専用の処理が実行したら、次の処理から再開する
●検査例外
・最も基本となる例外。
・例外に対するエラー処理を記述する必要がある。
・エラー処理がなかった場合コンパイルすることが出来ないため、プログラマーのミスを防ぐことができる。
●非検査例外
・プログラムの様々な場所で発生する可能性がある例外を表している。
・エラー処理の記述しなくてもコンパイルすることができる。
●エラー
・プログラムが動いているコンピューターのメモリ不足やハードウェアの故障など、主にエラー処理を書くことが難しい状況を表している。
・エラー処理を記述しなくてもコンパイル可能。

・「try/catch」を利用することで、例外を検出することができる。
・構文：try{例外が発生する可能性がある処理}catch{例外が発生した時の処理}
→catch(例外の型名 変数){例外が発生した時の処理}で複数指定可能。
・catchで指定する例外の型名は、検出したい例外クラスそのものではなく、例外クラスのスーパークラスにも指定することができる。
・finally・・・例外発生の有無に関わらず必ず実行される処理を記述。
→構文：try{}catch(){}finally{}

●リソース
・ハードディスクやメモリの容量などのこと。
・リソースをjavaで使用するときは、開始と終了時に指示が必要。
・構文：try(MyResource resouce = new MyResource() リソースを行う指示)
　　　　{リソースを使った指示}

●例外を発生させるには
1.発生させたい例外クラスをインスタンス化
2.「throw」にインスタンスを指定して例外を発生させる（構文：throw 例外クラスのインスタンス）
→throwが実行されると、以降の処理は実行されない。

●スタックトレース
・例外はスタックトレースという情報を持っている。
・構文：例外オブジェクト：printStackTrace();

「15 スレッド」
・複数の処理が絡み合って大きな流れを作る一つ一つの処理の流れをスレッドと言う。
・スレッドが一つのプログラムを「シングルスレッド」と言う。
・スレッドが複数あるプログラムを「マルチスレッド」と言う。
→マルチスレッドを正しく作るための考え方を「スレッドセーフ」と言う。

●スレッドの基礎
方法1：Threadクラスを継承したクラスを作成する
方法2:Runnableインターフェイスを実装したクラスに処理を記述し、このクラスをThreadコンストラクターに渡す。

●スレッドセーフ
・複数のスレッドを使用しても、安全に動作するプログラムをスレッドセーフなプログラムと言う。
・マルチスレッドを用いることで生じるプログラムのズレの対策を行うことを「排他制御」と言う。
・排他制御を実現するには、「Synchronized/シンクロナイズド」なメソッドを利用することができる。
・Synchronizedブロックはメソッドよりもより細かい制御を行うことができる
→構文：Synchronized(lock){//排他制御したい処理}

「16 ライブラリ」
・ライブラリとは、よく使う機能をいろんなアプリケーションで再利用できるようにまとめたもの。
・拡張子が「.jar」として作られるのでjarファイルと呼ばれている。

●Javaクラスライブラリ
・javaそのものにも多くのクラスが収められたライブラリがあらかじめ用意されており、「javaクラスライブラリ」略して「クラスライブラリ」と呼ばれている。
・バージョンによって用意されているものが少しづつ違う。
【代表的なパッケージ（名前空間）】
・java.lang
→インポートしなくても使用できる。
→MathクラスやThreadクラスなど。
→ラッパークラス（基本型→文字列の変換は「toStringメソッド」、文字列→基本型は「parseXxxメソッド」）
→基本型をラッパークラスに変換するには「ValueOfメソッド」を使う。
・java.util
→DateクラスやCalenderクラスなど。
→コレクションに関する一連のクラス。
・java.io
→入力と出力を行うための機能。
→入力とは外部の装置からコンピューターにデータを取り込むこと。
→出力とはコンピューターの中から外部装置にデータを送ること。

 */