package surasura.chapter9.list9_7;

class Car {
    /* スピードを保存するフィールド */
    int speed;

    /* スピードを上げるメソッド */
    void speedUp(int value) {
        this.speed += value;
    }

    /* スピードを下げるメソッド */
    void speedDown(int value) {
        this.speed -= value;
    }
}

/*
「9 クラスの基礎」
・クラス名は「Pascal形式」・・・文字の先頭と単語の区切りを大文字で残りを小文字で記述する。（Car,SuperCerなど）
・フィールドとはクラスの中の変数のこと。
・フィールド名（変数）は「camel形式」・・・文字の先頭を除く単語の区切りを大文字で残りを小文字で記述する。（speed,normalSpeedなど）
・フィールドを定義した時は初期値が代入される。→基本型（数値）：0、基本型（真偽値）：false、参照型：null
*/