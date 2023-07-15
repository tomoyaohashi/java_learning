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
//メソッドの値が返す必要のないものであった場合は「void型」を使用する